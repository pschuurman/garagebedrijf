package com.garage.eindopdracht.controller;

import com.garage.eindopdracht.dto.RepairDto;
import com.garage.eindopdracht.service.RepairService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/repairs")
public class RepairController {

    private final RepairService service;

    public RepairController(RepairService service) {this.service = service; }

    @PostMapping("")
    public ResponseEntity<Long> createRepair(@RequestBody RepairDto repairDto) {
        Long repairId = service.createRepair(repairDto);
        return new ResponseEntity<>(repairId, HttpStatus.CREATED);
    }
}
