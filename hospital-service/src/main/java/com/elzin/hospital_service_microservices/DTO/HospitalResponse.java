package com.elzin.hospital_service_microservices.DTO;

import java.util.UUID;

public class HospitalResponse {
    private UUID id;
    private String name;
    private String location;
    private int availableBeds;
    private boolean hasOxygenSupport;
    private boolean hasVentilatorSupport;

    public HospitalResponse() {
    }

    public HospitalResponse(UUID id, String name, int availableBeds, String location, int availableICUBeds, int availableDoctors, boolean hasOxygenSupport, boolean hasVentilatorSupport, String speciality) {
        this.id = id;
        this.name = name;
        this.availableBeds = availableBeds;
        this.location = location;
        this.hasOxygenSupport = hasOxygenSupport;
        this.hasVentilatorSupport = hasVentilatorSupport;
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
