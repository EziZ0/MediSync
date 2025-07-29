package com.elzin.hospital_service_microservices.Model;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "hospitals")
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String name, location, contactNumber;
    private int totalBeds, availableBeds;
    private boolean hasOxygenSupport, hasVentilatorSupport;

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
        this.hasOxygenSupport = hasOxygenSupport;
        this.hasVentilatorSupport = hasVentilatorSupport;
    }

    public Hospital() {
    }
}
