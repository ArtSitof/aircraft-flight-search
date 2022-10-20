package com.naumen.aircraftflightsearch.service;

import com.naumen.aircraftflightsearch.entity.Flight;

import java.util.List;

public interface FlightService {
    List<Flight> getAllFlights();
    void saveNewFlight(Flight flight);
}