package com.mlm.backend.Model;

import com.mlm.backend.Enums.ContractStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class RentalContract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "start_date")
    private LocalDateTime startDate;

    @Column(name = "end_date")
    private LocalDateTime endDate;

    @Column(name = "monthly_rent")
    private int monthlyRent;

    @Column(name = "deposit")
    private int deposit;

    @Enumerated(EnumType.STRING)
    private ContractStatus status; // ACTIVE, TERMINATED, PENDING

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "tenant_id")
    private Tenant tenant;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "property_id")
    private Property property;

    @OneToMany(mappedBy = "contract")
    private List<Payment> payments;
}
