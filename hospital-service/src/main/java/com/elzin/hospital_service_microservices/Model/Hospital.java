package com.elzin.hospital_service_microservices.Model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "hospitals")
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String name, location, contactNumber, speciality;
    private int totalBeds, availableBeds, totalICUBeds, availableICUBeds, totalDoctors, availableDoctors;
    private boolean hasOxygenSupport, hasVentilatorSupport;

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
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

    public int getTotalBeds() {
        return totalBeds;
    }

    public void setTotalBeds(int totalBeds) {
        this.totalBeds = totalBeds;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public int getAvailableBeds() {
        return availableBeds;
    }

    public void setAvailableBeds(int availableBeds) {
        this.availableBeds = availableBeds;
    }

    public int getAvailableICUBeds() {
        return availableICUBeds;
    }

    public void setAvailableICUBeds(int availableICUBeds) {
        this.availableICUBeds = availableICUBeds;
    }

    public int getTotalICUBeds() {
        return totalICUBeds;
    }

    public void setTotalICUBeds(int totalICUBeds) {
        this.totalICUBeds = totalICUBeds;
    }

    public int getTotalDoctors() {
        return totalDoctors;
    }

    public void setTotalDoctors(int totalDoctors) {
        this.totalDoctors = totalDoctors;
    }

    public int getAvailableDoctors() {
        return availableDoctors;
    }

    public void setAvailableDoctors(int availableDoctors) {
        this.availableDoctors = availableDoctors;
    }

    public boolean isHasOxygenSupport() {
        return hasOxygenSupport;
    }

    public void setHasOxygenSupport(boolean hasOxygenSupport) {
        this.hasOxygenSupport = hasOxygenSupport;
    }

    public boolean isHasVentilatorSupport() {
        return hasVentilatorSupport;
    }

    public void setHasVentilatorSupport(boolean hasVentilatorSupport) {
        this.hasVentilatorSupport = hasVentilatorSupport;
    }

    public Hospital(UUID id, String name, String contactNumber, String location, int totalBeds, int availableBeds, int totalICUBeds, int availableICUBeds, int totalDoctors, int availableDoctors, boolean hasOxygenSupport, boolean hasVentilatorSupport) {
        this.id = id;
        this.name = name;
        this.contactNumber = contactNumber;
        this.location = location;
        this.totalBeds = totalBeds;
        this.availableBeds = availableBeds;
        this.totalICUBeds = totalICUBeds;
        this.availableICUBeds = availableICUBeds;
        this.totalDoctors = totalDoctors;
        this.availableDoctors = availableDoctors;
        this.hasOxygenSupport = hasOxygenSupport;
        this.hasVentilatorSupport = hasVentilatorSupport;
    }

    public Hospital() {
    }
}
