package com.garage.eindopdracht.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "cars")
public class Car {

    @Id
    @GeneratedValue
    private Long id;

    private String brand;

    private String type;

    private LocalDate shp;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    Customer customer;




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getShp() {
        return shp;
    }

    public void setShp(LocalDate shp) {
        this.shp = shp;
    }


}
