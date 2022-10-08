package com.naumen.aircraftflightsearch.entity;

import lombok.Data;

import javax.persistence.*;

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

    @OneToOne(mappedBy = "aircraft"
            , cascade = CascadeType.ALL)
    private Flight flight;

}
