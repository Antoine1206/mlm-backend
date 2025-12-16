package com.mlm.backend.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Tenant extends User {

    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "profession")
    private String profession;
    @Column(name = "monthly_income")
    private Double monthlyIncome;

    @OneToMany(mappedBy = "tenant")
    private List<RentalContract> rentalContracts;
}
