package com.naumen.aircraftflightsearch.entity;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "companies")
@Data
@NoArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "company_name")
    private String companyName;

    @Column(name = "url")
    private String url;

    @Column(name = "address")
    private String address;

    public Company(Long id, String companyName, String url, String address) {
        this.id = id;
        this.companyName = companyName;
        this.url = url;
        this.address = address;
    }

    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(cascade = {CascadeType.REFRESH, CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST},
            mappedBy = "company")
    private List<Flight> flights = new ArrayList<>();

    public void addFlightToCompany(Flight flight) {
        flights.add(flight);
        flight.setCompany(this);
    }
}