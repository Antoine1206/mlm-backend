package com.mlm.backend.Dto;

import com.mlm.backend.Enums.PaymentStatus;
import com.mlm.backend.Model.RentalContract;
import jakarta.persistence.*;

import java.time.LocalDateTime;

public class PaymentDto {

    private Long id;
    private int amount;
    private LocalDateTime paymentDate;
    private PaymentStatus status;
    private RentalContract contract;


    public PaymentDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public LocalDateTime getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(LocalDateTime paymentDate) {
        this.paymentDate = paymentDate;
    }

    public PaymentStatus getStatus() {
        return status;
    }

    public void setStatus(PaymentStatus status) {
        this.status = status;
    }

    public RentalContract getContract() {
        return contract;
    }

    public void setContract(RentalContract contract) {
        this.contract = contract;
    }
}
