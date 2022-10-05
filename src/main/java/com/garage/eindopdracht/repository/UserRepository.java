package com.garage.eindopdracht.repository;

import com.garage.eindopdracht.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
}
