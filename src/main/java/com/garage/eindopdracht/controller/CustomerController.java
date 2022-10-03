package com.garage.eindopdracht.controller;

import com.garage.eindopdracht.model.Customer;
import com.garage.eindopdracht.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    CustomerRepository repos;
    @PostMapping("")
    public ResponseEntity<Customer> createCustomer(@RequestBody Customer customerInput) {
        Customer newCustomer = repos.save(customerInput);
        return new ResponseEntity<>(newCustomer, HttpStatus.CREATED);
    }
}
