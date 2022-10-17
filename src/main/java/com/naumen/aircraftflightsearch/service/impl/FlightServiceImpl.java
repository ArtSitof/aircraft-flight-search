package com.naumen.aircraftflightsearch.service.impl;

import com.naumen.aircraftflightsearch.entity.Flight;
import com.naumen.aircraftflightsearch.repository.FlightRepository;
import com.naumen.aircraftflightsearch.service.FlightService;
import org.springframework.stereotype.Service;

@Service
public class FlightServiceImpl implements FlightService {

    private final FlightRepository flightRepository;

    public FlightServiceImpl(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public Flight getFlightById(Long id) {
        return flightRepository.findById(id).get();
    }
}