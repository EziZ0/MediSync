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
import java.util.Optional;
import java.util.UUID;

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
        hospital.setHasOxygenSupport(request.isHasOxygenSupport());
        hospital.setHasVentilatorSupport(request.isHasVentilatorSupport());
        hospital.setLatitude(request.getLatitude());
        hospital.setLongitude(request.getLongitude());

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



    private HospitalResponse mapToResponse(Hospital hospital) {
        HospitalResponse response = new HospitalResponse();
        response.setId(hospital.getId());
        response.setName(hospital.getName());
        response.setLocation(hospital.getLocation());
        response.setAvailableBeds(hospital.getAvailableBeds());
        response.setHasOxygenSupport(hospital.isHasOxygenSupport());
        response.setHasVentilatorSupport(hospital.isHasVentilatorSupport());
        return response;
    }

    public List<Hospital> getAll() {
        return hospitalRepository.findAll();
    }

    public Double calculateDistance(UUID id, Double latitude, Double longitude) {
         Hospital hos = hospitalRepository.findById(id).get();
         if(hos == null){
             return 0.0;
         }
        double lat1 = hos.getLatitude();
        double lon1 = hos.getLongitude();
        double lat2 = latitude;
        double lon2 = longitude;

        double R = 6371; // Earth radius in km
        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);

        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
                        Math.sin(dLon / 2) * Math.sin(dLon / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return Math.round((R*c) * 100.0) / 100.0;
    }

    public Hospital findNearest(double lon, double lat) {
        return hospitalRepository.findNearest(lon, lat);
    }

}
