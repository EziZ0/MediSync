package com.elzin.patient_service_microservices.DTO;

public class EmergencyRequest {
    private String name;
    private String location;
    private String medicalCondition;
    private Integer noOfBedsToBeBooked;

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

    public String getMedicalCondition() {
        return medicalCondition;
    }

    public void setMedicalCondition(String medicalCondition) {
        this.medicalCondition = medicalCondition;
    }
}
