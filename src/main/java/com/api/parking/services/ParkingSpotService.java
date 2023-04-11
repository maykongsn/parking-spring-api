package com.api.parking.services;

import com.api.parking.models.ParkingSpot;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public interface ParkingSpotService {
    ParkingSpot save(ParkingSpot parkingSpot);
    boolean existsByParkingSpot(String parkingSpot);
    boolean existsByApartmentAndBlock(String apartment, String block);
    List<ParkingSpot> findAllWithCar();
    Optional<ParkingSpot> findById(UUID id);
    void delete(ParkingSpot parkingSpot);
}
