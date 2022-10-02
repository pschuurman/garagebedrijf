package com.garage.eindopdracht.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Invoice {

    @Id
    @GeneratedValue
    private Long id;
}
