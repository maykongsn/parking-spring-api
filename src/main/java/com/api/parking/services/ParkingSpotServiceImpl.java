package com.api.parking.services;

import com.api.parking.models.ParkingSpot;
import com.api.parking.repositories.ParkingSpotRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
    public List<ParkingSpot> findAll() {
        return parkingSpotRepository.findAll();
    }
}
