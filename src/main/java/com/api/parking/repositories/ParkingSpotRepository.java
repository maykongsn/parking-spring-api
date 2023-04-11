package com.api.parking.repositories;

import com.api.parking.models.ParkingSpot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ParkingSpotRepository extends JpaRepository<ParkingSpot, UUID> {
    @Query("FROM ParkingSpot ps, Car c WHERE ps.car.id = c.id")
    List<ParkingSpot> findAllWithCar();
    boolean existsByParkingSpot(String parkingSpot);
    boolean existsByApartmentAndBlock(String apartment, String block);
}
