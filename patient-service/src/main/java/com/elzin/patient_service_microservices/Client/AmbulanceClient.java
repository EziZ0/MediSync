package com.elzin.patient_service_microservices.Client;

import com.elzin.patient_service_microservices.Model.Ambulance;
import org.springframework.http.ResponseEntity;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PutExchange;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.UUID;

public interface AmbulanceClient {

    @GetExchange("/api/ambulances/available/{location}")
    List<Ambulance> getAvailable(@PathVariable String location);

    @PutExchange("/api/ambulances/{id}/status")
    ResponseEntity<String> updateStatus(@PathVariable UUID id);
}

