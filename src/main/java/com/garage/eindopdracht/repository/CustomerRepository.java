package com.garage.eindopdracht.repository;

import com.garage.eindopdracht.model.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
