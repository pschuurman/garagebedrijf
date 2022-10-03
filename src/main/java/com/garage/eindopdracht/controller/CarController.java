package com.garage.eindopdracht.controller;

import com.garage.eindopdracht.model.Car;
import com.garage.eindopdracht.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class CarController {
    @Autowired
    CarRepository repos;
    @PostMapping("")
    public ResponseEntity<Car> createCar(@RequestBody Car carInput) {
        Car newCar = repos.save(carInput);
        return new ResponseEntity<>(newCar, HttpStatus.CREATED);

    }


}
