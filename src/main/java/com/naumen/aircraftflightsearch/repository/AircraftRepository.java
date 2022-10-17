package com.naumen.aircraftflightsearch.repository;

import com.naumen.aircraftflightsearch.entity.Aircraft;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AircraftRepository extends JpaRepository<Aircraft, Long> {

}