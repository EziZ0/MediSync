package com.elzin.patient_service_microservices.Client;


import com.elzin.patient_service_microservices.Model.Hospital;
import org.springframework.http.ResponseEntity;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PutExchange;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.UUID;

public interface HospitalClient {

    @GetExchange("/api/hospitals/bed/{beds}/{location}")
    List<Hospital> getAllHospitals(@PathVariable Integer beds,@PathVariable String location);

    @PutExchange("/api/hospitals/{id}/{beds}")
    void updateBeds(@PathVariable UUID id, @PathVariable int beds);

    @GetExchange("/api/hospitals/{speciality}")
    ResponseEntity<?> getBySpeciality(@PathVariable String speciality);
}
