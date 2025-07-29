package com.elzin.hospital_service_microservices.DTO;

public class HospitalRequest {
    private String name;
    private String location;
    private String contactNumber;
    private int totalBeds;
    private boolean hasOxygenSupport;
    private boolean hasVentilatorSupport;
    private String speciality;

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
