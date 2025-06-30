package com.elzin.patient_service_microservices.Model;

import java.util.UUID;

public class Ambulance {
    private UUID id;
    private String driverName;
    private String location;
    private String available;
    public UUID getId() { return id; }
    public void setId(UUID id) { this.id = id; }
    public String getDriverName() { return driverName; }
    public void setDriverName(String driverName) { this.driverName = driverName; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
    public String isAvailable() { return available; }
    public void setAvailable(String available) { this.available = available; }
}
