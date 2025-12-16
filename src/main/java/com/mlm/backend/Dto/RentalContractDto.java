package com.mlm.backend.Dto;

import com.mlm.backend.Enums.ContractStatus;
import com.mlm.backend.Model.Payment;
import com.mlm.backend.Model.Property;
import com.mlm.backend.Model.Tenant;
import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

public class RentalContractDto {

    private Long id;
    private LocalDateTime startDate;
    private LocalDateTime endDate;
    private int monthlyRent;
    private int deposit;
    private ContractStatus status; // ACTIVE, TERMINATED, PENDING
    private Tenant tenant;
    private Property property;
    private List<Payment> payments;

    public RentalContractDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    public LocalDateTime getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    public int getMonthlyRent() {
        return monthlyRent;
    }

    public void setMonthlyRent(int monthlyRent) {
        this.monthlyRent = monthlyRent;
    }

    public int getDeposit() {
        return deposit;
    }

    public void setDeposit(int deposit) {
        this.deposit = deposit;
    }

    public ContractStatus getStatus() {
        return status;
    }

    public void setStatus(ContractStatus status) {
        this.status = status;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public Property getProperty() {
        return property;
    }

    public void setProperty(Property property) {
        this.property = property;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }
}
