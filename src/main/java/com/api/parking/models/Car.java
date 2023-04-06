package com.api.parking.models;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
public class Car implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(nullable = false, unique = true, length = 7)
    private String licensePlate;
    @Column(nullable = false, length = 70)
    private String brand;
    @Column(nullable = false, length = 70)
    private String model;
    @Column(nullable = false, length = 70)
    private String color;

    @OneToOne(mappedBy = "car")
    private ParkingSpot parkingSpot;
}
