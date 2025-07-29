package com.elzin.patient_service_microservices.Client;


import com.elzin.patient_service_microservices.Model.Hospital;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.PutExchange;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.UUID;

public interface HospitalClient {

    @GetExchange("/api/hospitals/bed/{beds}/{location}")
    List<Hospital> getAllHospitals(@PathVariable Integer beds,@PathVariable String location);

    @GetExchange("api/hospitals/findNearest/{longitude}/{latitude}")
    public Hospital findNearest(@PathVariable double longitude, @PathVariable double latitude);


    @PutExchange("/api/hospitals/hospitals/{id}/{beds}")
    void updateBeds(@PathVariable UUID id, @PathVariable int beds);


    @GetExchange("/api/hospitals/all")
    List<Hospital> getALL();


}
