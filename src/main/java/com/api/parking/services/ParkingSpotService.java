package com.api.parking.services;

import com.api.parking.models.ParkingSpot;
import org.springframework.stereotype.Service;

@Service
public interface ParkingSpotService {
    ParkingSpot save(ParkingSpot parkingSpot);
}
