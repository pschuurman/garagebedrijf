package com.garage.eindopdracht.controller;

import com.garage.eindopdracht.model.Part;
import com.garage.eindopdracht.repository.PartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parts")
public class PartController {

    @Autowired
    PartRepository repos;
    @PostMapping("")
    public ResponseEntity<Part> createPart(@RequestBody Part partInput) {
        Part newPart = repos.save(partInput);
        return new ResponseEntity<>(newPart, HttpStatus.CREATED);
    }
}
