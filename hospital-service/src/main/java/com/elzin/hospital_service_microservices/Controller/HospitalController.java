package com.elzin.hospital_service_microservices.Controller;

import com.elzin.hospital_service_microservices.DTO.HospitalRequest;
import com.elzin.hospital_service_microservices.DTO.HospitalResponse;
import com.elzin.hospital_service_microservices.Model.Hospital;
import com.elzin.hospital_service_microservices.Service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/hospitals")
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

    @PostMapping
    public ResponseEntity<?> registerHospital(@RequestBody HospitalRequest request) {
        return hospitalService.registerHospital(request);
    }

    @GetMapping()
    List<Hospital> getALL(){
        return hospitalService.getAll();
    }

    @GetMapping("/bed/{beds}/{location}")
    List<Hospital> getAllHospitals(@PathVariable Integer beds,@PathVariable String location){
        return hospitalService.getAllHospitals(beds,location);
    }

}
