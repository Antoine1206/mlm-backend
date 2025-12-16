package com.mlm.backend.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "address")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "postalCode")
    private String postalCode;

    @Column(name = "surface")
    private Double surface;

    @Column(name = "rent")
    private Double rent;

    @Column(name = "charges")
    private Double charges;

    @Column(name = "available")
    private boolean available;

    @ManyToOne
    private Owner owner;

    @OneToMany(mappedBy = "property")
    private List<RentalContract> rentalContracts;
}

