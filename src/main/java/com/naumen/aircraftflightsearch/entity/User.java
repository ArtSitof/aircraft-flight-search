package com.naumen.aircraftflightsearch.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
@Data
public class User {

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

    @OneToMany(cascade = CascadeType.ALL
            , mappedBy = "user")
    List<Flight> flights;

}
