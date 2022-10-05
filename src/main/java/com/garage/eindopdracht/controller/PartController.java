package com.garage.eindopdracht.controller;

import com.garage.eindopdracht.dto.PartDto;
import com.garage.eindopdracht.service.PartService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parts")
public class PartController {

    private final PartService service;

    public PartController(PartService service) { this.service = service; }

    @PostMapping("")
    public ResponseEntity<Long> createPart(@RequestBody PartDto partDto) {
        Long partId = service.createPart(partDto);
        return new ResponseEntity<>(partId, HttpStatus.CREATED);
    }
}
