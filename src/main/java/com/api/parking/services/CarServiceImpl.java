package com.api.parking.services;

import com.api.parking.models.Car;
import com.api.parking.repositories.CarRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CarServiceImpl implements CarService {
    public final CarRepository carRepository;

    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    @Transactional
    public Car save(Car car) {
        return carRepository.save(car);
    }

    @Override
    public boolean existsByLicensePlate(String licensePlate) {
        return carRepository.existsByLicensePlate(licensePlate);
    }
}
