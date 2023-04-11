package com.api.parking.services;

import com.api.parking.models.ParkingSpot;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public interface ParkingSpotService {
    ParkingSpot save(ParkingSpot parkingSpot);
    boolean existsByParkingSpot(String parkingSpot);
    boolean existsByApartmentAndBlock(String apartment, String block);
    Page<ParkingSpot> findAll(Pageable pageable);
    Optional<ParkingSpot> findById(UUID id);
    void delete(ParkingSpot parkingSpot);
}
