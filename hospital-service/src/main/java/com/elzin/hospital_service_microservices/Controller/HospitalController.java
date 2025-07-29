package com.elzin.hospital_service_microservices.Controller;

import com.elzin.hospital_service_microservices.DTO.HospitalRequest;
import com.elzin.hospital_service_microservices.DTO.HospitalResponse;
import com.elzin.hospital_service_microservices.Model.Hospital;
import com.elzin.hospital_service_microservices.Service.HospitalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.service.annotation.PutExchange;

import java.util.List;
import java.util.UUID;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/hospitals")
public class HospitalController {

    @Autowired
    private HospitalService hospitalService;

    @PostMapping
    public ResponseEntity<?> registerHospital(@RequestBody HospitalRequest request) {
        return hospitalService.registerHospital(request);
    }

    @GetMapping("/all")
    List<Hospital> getALL(){
        return hospitalService.getAll();
    }

    @GetMapping("/bed/{beds}/{location}")
    List<Hospital> getAllHospitals(@PathVariable Integer beds,@PathVariable String location){
        return hospitalService.getAllHospitals(beds,location);
    }

    @PutMapping("/hospitals/{id}/{beds}")
    ResponseEntity<?> updateBeds(@PathVariable UUID id, @PathVariable int beds){
//        return "SUCCESS";
        return hospitalService.updateBeds(id,beds);
    }



    @GetMapping("/findNearest/{longitude}/{latitude}")
    public Hospital findNearest(@PathVariable double longitude,
                                @PathVariable double latitude) {
        return hospitalService.findNearest(longitude, latitude);
    }


}
