package com.naumen.aircraftflightsearch.repository;

import com.naumen.aircraftflightsearch.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {

}