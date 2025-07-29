package com.elzin.patient_service_microservices.DTO;

public class EmergencyRequest {
    private String name;
    private String location;
    private Integer noOfBedsToBeBooked;
    private Double latitude;
    private Double longitude;

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Integer getNoOfBedsToBeBooked() {
        return noOfBedsToBeBooked;
    }

    public void setNoOfBedsToBeBooked(Integer noOfBedsToBeBooked) {
        this.noOfBedsToBeBooked = noOfBedsToBeBooked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

}
