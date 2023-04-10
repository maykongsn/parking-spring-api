package com.api.parking.services;

import com.api.parking.models.ParkingSpot;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ParkingSpotService {
    ParkingSpot save(ParkingSpot parkingSpot);
    boolean existsByParkingSpot(String parkingSpot);
    boolean existsByApartmentAndBlock(String apartment, String block);
    List<ParkingSpot> findAll();
}
