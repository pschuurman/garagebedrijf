package com.garage.eindopdracht.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Part {

    @Id
    @GeneratedValue
    private Long id;
}
