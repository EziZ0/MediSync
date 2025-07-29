package com.elzin.patient_service_microservices.Service;

import com.elzin.patient_service_microservices.Client.AmbulanceClient;
import com.elzin.patient_service_microservices.Client.HospitalClient;
import com.elzin.patient_service_microservices.DTO.EmergencyRequest;
import com.elzin.patient_service_microservices.DTO.PatientResponse;
import com.elzin.patient_service_microservices.Model.Ambulance;
import com.elzin.patient_service_microservices.Model.Hospital;
import com.elzin.patient_service_microservices.Model.Patient;
import com.elzin.patient_service_microservices.Repo.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class PatientService {

    @Autowired
    private PatientRepository patientRepo;
    @Autowired
    private AmbulanceClient ambulanceClient;
    @Autowired
    private HospitalClient hospitalClient;

    public PatientResponse handleEmergency(EmergencyRequest request) {

        List<Hospital> hospitals = hospitalClient.getAllHospitals(request.getNoOfBedsToBeBooked(), request.getLocation());
        if (hospitals.isEmpty()) {
            PatientResponse p = new PatientResponse();
            p.setPatient(null);
            p.setResponse("No hospitals available for the Location");
            return p;
        }


        List<Ambulance> ambulances = ambulanceClient.getAvailable(request.getLocation());
        if (ambulances.isEmpty()) {
                PatientResponse p = new PatientResponse();
                p.setPatient(null);
                p.setResponse("No Ambulances available for the Location");
                return p;
        }

        Ambulance ambulance = ambulances.get(0);
        Hospital hospital = null;
        if(hospitals.size() > 1){
           hospital = hospitalClient.findNearest(request.getLongitude(), request.getLatitude());
        }else {
             hospital = hospitals.get(0);
        }

        hospitalClient.updateBeds(hospital.getId(), request.getNoOfBedsToBeBooked());

        ambulanceClient.updateStatus(ambulance.getId());

        Patient patient = new Patient();
        patient.setName(request.getName());
        patient.setLocation(request.getLocation());
        patient.setAssignedAmbulance(ambulance.getDriverName());
        patient.setAssignedHospital(hospital.getName());

         patientRepo.save(patient);
         PatientResponse patientResponse = new PatientResponse();
         patientResponse.setResponse("1");
         patientResponse.setPatient(patient);
         return patientResponse;
    }


    public List<Patient> findAll() {
        return patientRepo.findAll();
    }
}