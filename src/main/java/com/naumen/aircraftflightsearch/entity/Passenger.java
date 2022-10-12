package com.naumen.aircraftflightsearch.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "passengers")
@Data
@NoArgsConstructor
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private  String surname;

    @Column(name = "age")
    private int age;

    @Column(name = "passport_id")
    private int passportID;

    @Column(name = "sex")
    private String sex;

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    @ToString.Exclude
    @ManyToMany(cascade = {CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST})
    @JoinTable(
            name = "flights_passengers",
            joinColumns = @JoinColumn(name = "passenger_id"),
            inverseJoinColumns = @JoinColumn(name = "flight_id")
    )
    List<Flight> flights;

    public void addFlightToPassenger(Flight flight) {
        if (flights == null) {
            flights = new ArrayList<>();
        }
        flights.add(flight);
    }
}