package com.elzin.ambulance_service_microservices.DTO;

import java.util.UUID;

public class AmbulanceResponse {

    private UUID id;
    private String registrationNumber;
    private String location;
    private Boolean status;

    public AmbulanceResponse() {}

    public AmbulanceResponse(UUID id, String registrationNumber, String location, Boolean status) {
        this.id = id;
        this.registrationNumber = registrationNumber;
        this.location = location;
        this.status = status;
    }

    public UUID getId() {
        return id;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getLocation() {
        return location;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
