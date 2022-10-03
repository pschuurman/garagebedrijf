package com.garage.eindopdracht.controller;

import com.garage.eindopdracht.model.Repair;
import com.garage.eindopdracht.repository.RepairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/repairs")
public class RepairController {

    @Autowired
    RepairRepository repos;
    @PostMapping("")
    public ResponseEntity<Repair> createRepair(@RequestBody Repair repairInput) {
        Repair newRepair = repos.save(repairInput);
        return new ResponseEntity<>(newRepair, HttpStatus.CREATED);
    }
}
