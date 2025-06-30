package com.elzin.hospital_service_microservices.Service;

import com.elzin.hospital_service_microservices.DTO.HospitalRequest;
import com.elzin.hospital_service_microservices.DTO.HospitalResponse;
import com.elzin.hospital_service_microservices.Model.Hospital;
import com.elzin.hospital_service_microservices.Repo.HospitalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class HospitalService {

    @Autowired
    private HospitalRepo hospitalRepository;

    public ResponseEntity<?> registerHospital(HospitalRequest request) {
        Hospital hospital = new Hospital();
        hospital.setName(request.getName());
        hospital.setLocation(request.getLocation());
        hospital.setContactNumber(request.getContactNumber());
        hospital.setTotalBeds(request.getTotalBeds());
        hospital.setAvailableBeds(request.getTotalBeds());
        hospital.setTotalICUBeds(request.getTotalICUBeds());
        hospital.setAvailableICUBeds(request.getTotalICUBeds());
        hospital.setTotalDoctors(request.getTotalDoctors());
        hospital.setAvailableDoctors(request.getTotalDoctors());
        hospital.setHasOxygenSupport(request.isHasOxygenSupport());
        hospital.setHasVentilatorSupport(request.isHasVentilatorSupport());
        hospital.setSpeciality(request.getSpeciality());

        hospitalRepository.save(hospital);
        return new ResponseEntity<>("Hospital registered with ID: " + hospital.getId(), HttpStatus.CREATED);
    }

    public List<Hospital> getAllHospitals(Integer beds,String location) {
        List<Hospital> hospitals = hospitalRepository.findAllByAvailableBedsGreaterThanAndLocationIgnoreCase(beds,location);
        return hospitals;
    }

    public ResponseEntity<?> updateBeds(UUID id,Integer beds) {
        Hospital hospital = hospitalRepository.findById(id)
                .orElse(null);
        if (hospital == null) {
            return new ResponseEntity<>("Hospital not found", HttpStatus.NOT_FOUND);
        }
        hospital.setAvailableBeds(hospital.getAvailableBeds()-beds);
        hospitalRepository.save(hospital);
        return new ResponseEntity<>("Beds updated successfully", HttpStatus.OK);
    }

    public ResponseEntity<?> getHospitalBySpeciality(String speciality) {
        List<Hospital> hospitals = hospitalRepository.findAllBySpecialityIgnoreCase(speciality);
        if (hospitals.isEmpty()) {
            return new ResponseEntity<>("No hospitals found with speciality: " + speciality, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(hospitals.stream()
                .map(this::mapToResponse)
                .collect(Collectors.toList()), HttpStatus.OK);
    }

    private HospitalResponse mapToResponse(Hospital hospital) {
        HospitalResponse response = new HospitalResponse();
        response.setId(hospital.getId());
        response.setName(hospital.getName());
        response.setLocation(hospital.getLocation());
        response.setAvailableBeds(hospital.getAvailableBeds());
        response.setAvailableICUBeds(hospital.getAvailableICUBeds());
        response.setAvailableDoctors(hospital.getAvailableDoctors());
        response.setHasOxygenSupport(hospital.isHasOxygenSupport());
        response.setHasVentilatorSupport(hospital.isHasVentilatorSupport());
        response.setSpeciality(hospital.getSpeciality());
        return response;
    }

    public List<Hospital> getAll() {
        return hospitalRepository.findAll();
    }
}
