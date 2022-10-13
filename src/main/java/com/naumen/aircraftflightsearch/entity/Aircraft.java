package com.naumen.aircraftflightsearch.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "aircrafts")
@Data
@NoArgsConstructor
public class Aircraft {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private Long id;

    @Column(name = "aircraft_name")
    private String aircraftName;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(cascade = {CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST},
                mappedBy = "aircraft")
    private List<Flight> flights = new ArrayList<>();

    public void addFlightToAircraft(Flight flight) {
        flights.add(flight);
        flight.setAircraft(this);
    }
}