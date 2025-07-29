package com.elzin.patient_service_microservices.Model;

import java.util.UUID;

public class Hospital {
    private UUID id;
    private String name;
    private String location;
    private String contactNumber;
    private int totalBeds;
    private int availableBeds;
    private boolean hasOxygenSupport;
    private boolean hasVentilatorSupport;

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

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }


    public int getTotalBeds() {
        return totalBeds;
    }

    public void setTotalBeds(int totalBeds) {
        this.totalBeds = totalBeds;
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
}
