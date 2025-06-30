package com.elzin.patient_service_microservices.Model;


import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "patients")
public class Patient {
    @Id
    @GeneratedValue
    private UUID id;

    private String name;
    private String location;
    private String medicalCondition;
    private String assignedHospitalId;
    private String assignedAmbulanceId;

    public Patient() {}

    public Patient(String name, String location, String medicalCondition) {
        this.name = name;
        this.location = location;
        this.medicalCondition = medicalCondition;
    }

    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
    public String getMedicalCondition() { return medicalCondition; }
    public void setMedicalCondition(String medicalCondition) { this.medicalCondition = medicalCondition; }
    public String getAssignedHospital() { return assignedHospitalId; }
    public void setAssignedHospital(String assignedHospitalId) { this.assignedHospitalId = assignedHospitalId; }
    public String getAssignedAmbulance() { return assignedAmbulanceId; }
    public void setAssignedAmbulance(String assignedAmbulanceId) { this.assignedAmbulanceId = assignedAmbulanceId; }

}