package com.api.parking.repositories;

import com.api.parking.models.ParkingSpot;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpot, UUID> {
    boolean existsByParkingSpot(String parkingSpot);
    boolean existsByApartmentAndBlock(String apartment, String block);
}
