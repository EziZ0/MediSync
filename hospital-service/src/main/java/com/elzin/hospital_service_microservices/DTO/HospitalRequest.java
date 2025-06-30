package com.elzin.hospital_service_microservices.DTO;

public class HospitalRequest {
    private String name;
    private String location;
    private String contactNumber;
    private int totalBeds;
    private int totalICUBeds;
    private int totalDoctors;
    private boolean hasOxygenSupport;
    private boolean hasVentilatorSupport;
    private String speciality;

    public HospitalRequest() {
    }

    public HospitalRequest(String name, String location, String contactNumber, int totalBeds, int totalICUBeds, int totalDoctors, boolean hasOxygenSupport, boolean hasVentilatorSupport, String speciality) {
        this.name = name;
        this.location = location;
        this.contactNumber = contactNumber;
        this.totalBeds = totalBeds;
        this.totalICUBeds = totalICUBeds;
        this.totalDoctors = totalDoctors;
        this.hasOxygenSupport = hasOxygenSupport;
        this.hasVentilatorSupport = hasVentilatorSupport;
        this.speciality = speciality;
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

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}
