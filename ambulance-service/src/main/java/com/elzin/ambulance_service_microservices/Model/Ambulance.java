package com.elzin.ambulance_service_microservices.Model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
public class Ambulance {

    @Id
    @GeneratedValue
    private UUID id;

    private String driverName;
    private String location;
    private String available; // FREE or BUSY
    private String mobileNumber;

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public Ambulance() {}



    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String status) {
        this.available = status;
    }
}
