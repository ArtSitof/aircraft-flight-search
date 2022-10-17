package com.naumen.aircraftflightsearch.repository;

import com.naumen.aircraftflightsearch.entity.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}