package com.mlm.backend.Dto;

import com.mlm.backend.Model.Property;
import com.mlm.backend.Model.RentalContract;
import com.mlm.backend.Model.Review;

import java.time.LocalDateTime;
import java.util.List;

public class TenantDto {

    private Long id;
    private String email;
    private String firstName;
    private String lastName;
    private LocalDateTime createdAt;
    private List<Review> receivedReviews;
    private List<Review> givenReviews;
    private List<Property> properties;
    private String phoneNumber;
    private String profession;
    private Double monthlyIncome;
    private List<RentalContract> rentalContracts;


    public TenantDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public List<Review> getReceivedReviews() {
        return receivedReviews;
    }

    public void setReceivedReviews(List<Review> receivedReviews) {
        this.receivedReviews = receivedReviews;
    }

    public List<Review> getGivenReviews() {
        return givenReviews;
    }

    public void setGivenReviews(List<Review> givenReviews) {
        this.givenReviews = givenReviews;
    }

    public List<Property> getProperties() {
        return properties;
    }

    public void setProperties(List<Property> properties) {
        this.properties = properties;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Double getMonthlyIncome() {
        return monthlyIncome;
    }

    public void setMonthlyIncome(Double monthlyIncome) {
        this.monthlyIncome = monthlyIncome;
    }

    public List<RentalContract> getRentalContracts() {
        return rentalContracts;
    }

    public void setRentalContracts(List<RentalContract> rentalContracts) {
        this.rentalContracts = rentalContracts;
    }
}
