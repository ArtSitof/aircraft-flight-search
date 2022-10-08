package com.naumen.aircraftflightsearch.entity;

import lombok.Data;

import javax.persistence.*;
import java.text.SimpleDateFormat;

@Entity
@Table(name = "flights")
@Data
public class Flight {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "flight_number")
    private String flightNumber;

    @Column(name = "depature_city")
    private String departureCity;

    @Column(name = "arrival_city")
    private String arrivalCity;

    @Column(name = "departure_date")
    private SimpleDateFormat departureDate;

    @Column(name = "arrival_date")
    private SimpleDateFormat arrivalDate;

    @Column(name = "company")
    private String company;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "aircraft_id")
    private Aircraft aircraft;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private User user;

}
