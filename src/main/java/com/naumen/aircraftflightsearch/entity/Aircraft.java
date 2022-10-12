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

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @ToString.Exclude
    @OneToMany(cascade = {CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "flight_id")
    private List<Flight> flights;

    public void addFlightToAircraft(Flight flight) {
        if (flights == null){
            flights = new ArrayList<>();
        }
        flights.add(flight);
        flight.setAircraft(this);
    }
}