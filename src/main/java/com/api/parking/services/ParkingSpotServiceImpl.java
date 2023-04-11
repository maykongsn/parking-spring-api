package com.api.parking.services;

import com.api.parking.models.ParkingSpot;
import com.api.parking.repositories.ParkingSpotRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
import java.util.UUID;

@Service
public class ParkingSpotServiceImpl implements ParkingSpotService {
    private final ParkingSpotRepository parkingSpotRepository;

    public ParkingSpotServiceImpl(ParkingSpotRepository parkingSpotRepository) {
        this.parkingSpotRepository = parkingSpotRepository;
    }

    @Override
    @Transactional
    public ParkingSpot save(ParkingSpot parkingSpot) {
        return parkingSpotRepository.save(parkingSpot);
    }

    @Override
    public boolean existsByParkingSpot(String parkingSpot) {
        return parkingSpotRepository.existsByParkingSpot(parkingSpot);
    }

    @Override
    public boolean existsByApartmentAndBlock(String apartment, String block) {
        return parkingSpotRepository.existsByApartmentAndBlock(apartment, block);
    }

    @Override
    public Page<ParkingSpot> findAll(Pageable pageable) {
        return parkingSpotRepository.findAll(pageable);
    }

    @Override
    public Optional<ParkingSpot> findById(UUID id) {
        return parkingSpotRepository.findById(id);
    }

    @Override
    @Transactional
    public void delete(ParkingSpot parkingSpot) {
        parkingSpotRepository.delete(parkingSpot);
    }
}
