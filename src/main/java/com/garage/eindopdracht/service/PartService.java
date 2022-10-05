package com.garage.eindopdracht.service;

import com.garage.eindopdracht.dto.PartDto;
import com.garage.eindopdracht.model.Part;
import com.garage.eindopdracht.repository.PartRepository;
import org.springframework.stereotype.Service;

@Service
public class PartService {

    private final PartRepository repos;

    public PartService(PartRepository repos) {
        this.repos = repos;
    }

    public Long createPart(PartDto partDto) {
        Part part = new Part();
        part.setPartName(partDto.partName);
        part.setPrice(partDto.price);

        Part savedPart = this.repos.save(part);

        return savedPart.getId();

    }
}
