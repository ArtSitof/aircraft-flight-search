package com.naumen.aircraftflightsearch.controller;

import com.naumen.aircraftflightsearch.entity.Aircraft;
import com.naumen.aircraftflightsearch.entity.Company;
import com.naumen.aircraftflightsearch.entity.Flight;
import com.naumen.aircraftflightsearch.service.FlightService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/api/v1")
public class FlightController {

    private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping("/flights")
    public String getAllFlights(Model model) {
        List<Flight> allFlights = flightService.getAllFlights();
        model.addAttribute("flights", allFlights);
        return "all-flights";
    }

    @GetMapping("/new")
    public void saveNewFlight() {
        Flight flight = new Flight();
        flight.setId(1l);
        flight.setFlightNumber("U123");
        flight.setDepartureCity("Perm");
        flight.setArrivalCity("Moscow");
        flight.setDepartureDate(new Date(2022, 10, 17, 2, 0));
        flight.setArrivalDate(new Date(2022, 10, 17, 4, 0));
        flight.setCompany(new Company(1L, "Aeroflot", "www.aeroflot.com", "Mocsow Lenina 1"));
        flight.setAircraft(new Aircraft(1L, "Airbus A-320"));
        flightService.saveNewFlight(flight);
    }
}