package com.garage.eindopdracht.service;

import com.garage.eindopdracht.dto.CustomerDto;
import com.garage.eindopdracht.model.Customer;
import com.garage.eindopdracht.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerRepository repos;

    public CustomerService(CustomerRepository repos) {
        this.repos = repos;
    }

    public Long createCustomer(CustomerDto customerDto) {
        Customer customer = new Customer();
        customer.setFirstName(customerDto.firstName);
        customer.setLastName(customerDto.lastName);
        customer.setStreet(customerDto.street);
        customer.setHouseNumber(customerDto.houseNumber);
        customer.setPostalCode(customerDto.postalCode);


        Customer savedCustomer = this.repos.save(customer);

        return savedCustomer.getId();

    }

}
