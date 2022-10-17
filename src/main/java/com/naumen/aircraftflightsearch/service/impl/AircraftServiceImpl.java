package com.naumen.aircraftflightsearch.service.impl;

import com.naumen.aircraftflightsearch.entity.Aircraft;
import com.naumen.aircraftflightsearch.repository.AircraftRepository;
import com.naumen.aircraftflightsearch.service.AircraftService;
import org.springframework.stereotype.Service;

@Service
public class AircraftServiceImpl implements AircraftService {
    private final AircraftRepository aircraftRepository;

    public AircraftServiceImpl(AircraftRepository aircraftRepository) {
        this.aircraftRepository = aircraftRepository;
    }

    public Aircraft getAircraftById(Long id) {
        return aircraftRepository.findById(id).get();
    }
}