package com.naumen.aircraftflightsearch;

import com.naumen.aircraftflightsearch.controller.FlightController;
import com.naumen.aircraftflightsearch.entity.Aircraft;
import com.naumen.aircraftflightsearch.entity.Company;
import com.naumen.aircraftflightsearch.entity.Flight;
import com.naumen.aircraftflightsearch.entity.Passenger;
import com.naumen.aircraftflightsearch.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;

@SpringBootApplication
public class AircraftFlightSearchApplication {

    public static void main(String[] args) throws ParseException {
        SpringApplication.run(AircraftFlightSearchApplication.class, args);
    }

}
