package com.elzin.patient_service_microservices.DTO;

import com.elzin.patient_service_microservices.Model.Patient;

public class PatientResponse {
    String response;
    Patient patient;

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
