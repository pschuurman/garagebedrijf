package com.garage.eindopdracht.service;

import com.garage.eindopdracht.dto.CarDto;
import com.garage.eindopdracht.model.Car;
import com.garage.eindopdracht.repository.CarRepository;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    private final CarRepository repos;

    public CarService(CarRepository repos) {
        this.repos = repos;
    }

    public Long createCar(CarDto carDto) {
        Car car = new Car();
        car.setBrand(carDto.brand);
        car.setType(carDto.type);
        car.setShp(carDto.shp);

        Car savedCar = this.repos.save(car);

        return savedCar.getId();

    }
}
