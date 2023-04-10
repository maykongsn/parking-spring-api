package com.api.parking.controllers;

import com.api.parking.dtos.CarSpotDto;
import com.api.parking.models.Car;
import com.api.parking.models.ParkingSpot;
import com.api.parking.services.CarService;
import com.api.parking.services.ParkingSpotService;
import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@RequestMapping("/parking-spot")
public class ParkingSpotController {
    private final ParkingSpotService parkingSpotService;
    private final CarService carService;

    public ParkingSpotController(ParkingSpotService parkingSpotService, CarService carService) {
        this.parkingSpotService = parkingSpotService;
        this.carService = carService;
    }

    @PostMapping
    public ResponseEntity<Object> saveParkingSpot(@RequestBody @Valid CarSpotDto carSpotDto) {
        var parkingSpot = new ParkingSpot();
        var car = new Car();
        BeanUtils.copyProperties(carSpotDto, parkingSpot);
        BeanUtils.copyProperties(carSpotDto, car);

        parkingSpot.setRegistrationDate(LocalDateTime.now(ZoneId.of("UTC")));
        parkingSpot.setCar(car);
        car.setParkingSpot(parkingSpot);

        parkingSpotService.save(parkingSpot);
        carService.save(car);
        return ResponseEntity.status(HttpStatus.CREATED).body(parkingSpot);
    }
}
