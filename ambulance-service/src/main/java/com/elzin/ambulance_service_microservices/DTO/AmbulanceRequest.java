package com.elzin.ambulance_service_microservices.DTO;

public class AmbulanceRequest {

    private String registrationNumber;
    private String location;

    public AmbulanceRequest() {}

    public AmbulanceRequest(String registrationNumber, String location) {
        this.registrationNumber = registrationNumber;
        this.location = location;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
