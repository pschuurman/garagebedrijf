package com.garage.eindopdracht.repository;

import com.garage.eindopdracht.model.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Long> {
}
