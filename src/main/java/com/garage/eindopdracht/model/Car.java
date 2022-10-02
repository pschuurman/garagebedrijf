package com.garage.eindopdracht.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Car {

    @Id
    @GeneratedValue
    private Long id;

    private String brand;

    private String type;

    private LocalDate shp;
}
