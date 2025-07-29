package com.elzin.patient_service_microservices.Controller;

import com.elzin.patient_service_microservices.Client.AmbulanceClient;
import com.elzin.patient_service_microservices.Client.HospitalClient;
import com.elzin.patient_service_microservices.DTO.EmergencyRequest;
import com.elzin.patient_service_microservices.DTO.PatientResponse;
import com.elzin.patient_service_microservices.Model.Ambulance;
import com.elzin.patient_service_microservices.Model.Hospital;
import com.elzin.patient_service_microservices.Model.Patient;
import com.elzin.patient_service_microservices.Service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/patients")
public class PatientController {

    @Autowired private PatientService patientService;
    @Autowired private HospitalClient hospitalClient;
    @Autowired private AmbulanceClient ambulanceClient;

    @PostMapping("/emergency")
    public ResponseEntity<?> raiseEmergency(@RequestBody EmergencyRequest request) {

         PatientResponse patientResponse = patientService.handleEmergency(request);
         if(patientResponse.getResponse().equals("1")){
        return new ResponseEntity<>(patientResponse.getPatient(),HttpStatus.OK);
        }else {
            return new ResponseEntity<>(patientResponse.getResponse(),HttpStatus.OK);
        }
    }



    @GetMapping
    public List<Patient> patient(){
        return patientService.findAll();
    }

    @GetMapping("/hospitals/all")
    public List<Hospital> getHospitals() {
        return hospitalClient.getALL();
    }

    @GetMapping("/ambulances/available/{location}")
    public List<Ambulance> getAvailableAmbulances(@PathVariable String location) {
        return ambulanceClient.getAvailable(location);
    }

    @GetMapping("/hospitals/bed/{beds}/{location}")
    public List<Hospital> getHospitalsByBeds(@PathVariable Integer beds,
                                             @PathVariable String location) {
        return hospitalClient.getAllHospitals(beds, location);
    }


}


