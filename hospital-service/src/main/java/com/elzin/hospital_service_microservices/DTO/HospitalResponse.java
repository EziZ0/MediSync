package com.elzin.hospital_service_microservices.DTO;

import java.util.UUID;

public class HospitalResponse {
    private UUID id;
    private String name;
    private String location;
    private int availableBeds;
    private int availableICUBeds;
    private int availableDoctors;
    private boolean hasOxygenSupport;
    private boolean hasVentilatorSupport;
    private String speciality;

    public HospitalResponse() {
    }

    public HospitalResponse(UUID id, String name, int availableBeds, String location, int availableICUBeds, int availableDoctors, boolean hasOxygenSupport, boolean hasVentilatorSupport, String speciality) {
        this.id = id;
        this.name = name;
        this.availableBeds = availableBeds;
        this.location = location;
        this.availableICUBeds = availableICUBeds;
        this.availableDoctors = availableDoctors;
        this.hasOxygenSupport = hasOxygenSupport;
        this.hasVentilatorSupport = hasVentilatorSupport;
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

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public boolean isHasVentilatorSupport() {
        return hasVentilatorSupport;
    }

    public void setHasVentilatorSupport(boolean hasVentilatorSupport) {
        this.hasVentilatorSupport = hasVentilatorSupport;
    }
}
