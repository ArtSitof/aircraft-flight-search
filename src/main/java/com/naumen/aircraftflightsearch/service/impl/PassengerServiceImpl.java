package com.naumen.aircraftflightsearch.service.impl;

import com.naumen.aircraftflightsearch.entity.Passenger;
import com.naumen.aircraftflightsearch.repository.PassengerRepository;
import com.naumen.aircraftflightsearch.service.PassengerService;
import org.springframework.stereotype.Service;

@Service
public class PassengerServiceImpl implements PassengerService {

    private final PassengerRepository passengerRepository;

    public PassengerServiceImpl(PassengerRepository passengerRepository) {
        this.passengerRepository = passengerRepository;
    }

    public Passenger getPassengerById(Long id) {
        return passengerRepository.findById(id).get();
    }
}