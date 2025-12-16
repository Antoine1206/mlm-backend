package com.mlm.backend.Dto;

import com.mlm.backend.Model.Owner;
import com.mlm.backend.Model.RentalContract;

import java.util.List;

public class PropertyDto {

    private Long id;
    private String title;
    private String description;
    private String address;
    private String city;
    private String postalCode;
    private Double surface;
    private Double rent;
    private Double charges;
    private boolean available;
    private Owner owner;
    private List<RentalContract> rentalContracts;

    public PropertyDto() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Double getSurface() {
        return surface;
    }

    public void setSurface(Double surface) {
        this.surface = surface;
    }

    public Double getRent() {
        return rent;
    }

    public void setRent(Double rent) {
        this.rent = rent;
    }

    public Double getCharges() {
        return charges;
    }

    public void setCharges(Double charges) {
        this.charges = charges;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public List<RentalContract> getRentalContracts() {
        return rentalContracts;
    }

    public void setRentalContracts(List<RentalContract> rentalContracts) {
        this.rentalContracts = rentalContracts;
    }
}
