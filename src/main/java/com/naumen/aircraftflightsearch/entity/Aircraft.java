package com.naumen.aircraftflightsearch.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "aircrafts")
@Data
public class Aircraft {

    @Id
    @GeneratedValue
    @Column (name = "id")
    private Long id;

    @Column(name = "names")
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "flights_id")
    private Flight flight;

}
