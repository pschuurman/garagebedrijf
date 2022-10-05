package com.garage.eindopdracht.controller;

import com.garage.eindopdracht.dto.CustomerDto;
import com.garage.eindopdracht.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    private final CustomerService service;

    public CustomerController(CustomerService service) { this.service = service; }


    @PostMapping("")
    public ResponseEntity<Long> createCustomer(@RequestBody CustomerDto customerDto) {
        Long customerId = service.createCustomer(customerDto);
        return new ResponseEntity<>(customerId, HttpStatus.CREATED);
    }
}
