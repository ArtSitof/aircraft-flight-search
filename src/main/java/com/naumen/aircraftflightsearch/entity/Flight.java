package com.naumen.aircraftflightsearch.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "flights")
@Data
@NoArgsConstructor
public class Flight {

    @Id
    @GeneratedValue
    @Column(name = "id")
    @EqualsAndHashCode.Exclude
    private Long id;

    @Column(name = "flight_number")
    private String flightNumber;

    @Column(name = "departure_city")
    private String departureCity;

    @Column(name = "arrival_city")
    private String arrivalCity;

    @Column(name = "departure_date")
    private Date departureDate;

    @Column(name = "arrival_date")
    private Date arrivalDate;

    @ManyToOne(cascade = {CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "company_id")
    @EqualsAndHashCode.Exclude
    private Company company;

    @ManyToOne(cascade = {CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "aircraft_id")
    @EqualsAndHashCode.Exclude
    private Aircraft aircraft;

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToMany(mappedBy = "flights",cascade = {CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST})
    private List<Passenger> passengers = new ArrayList<>();

    public void addPassengerToFlight(Passenger passenger){
        passengers.add(passenger);
    }
}