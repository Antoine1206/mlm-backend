package com.mlm.backend.Model;

import com.mlm.backend.Enums.PaymentStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "amount")
    private int amount;
    @Column(name = "payment_date")
    private LocalDateTime paymentDate;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private PaymentStatus status;

    //todo: To be done
/*    @Column(name = "transaction_id")
    private String transactionId; // Stripe / PayPal*/

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "contract_id", nullable = false)
    private RentalContract contract;
}
