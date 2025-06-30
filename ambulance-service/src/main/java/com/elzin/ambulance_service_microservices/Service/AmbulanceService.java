package com.elzin.ambulance_service_microservices.Service;

import com.elzin.ambulance_service_microservices.Model.Ambulance;
import com.elzin.ambulance_service_microservices.Repo.AmbulanceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class AmbulanceService {

    @Autowired
    private AmbulanceRepository ambulanceRepo;

    public UUID saveAmbulance(Ambulance ambulance) {
        ambulance.setAvailable("FREE");
        ambulance.setMobileNumber("+91 86672 82330");
        return ambulanceRepo.save(ambulance).getId();
    }

    public List<Ambulance> findAvailable(String location) {
        return ambulanceRepo.findByLocationIgnoreCaseAndAvailable(location, "FREE");
    }


    public void updateAvailability(UUID id) {
        Optional<Ambulance> optional = ambulanceRepo.findById(id);
        if (optional.isPresent()) {
            Ambulance amb = optional.get();
            amb.setAvailable("BUSY");
            ambulanceRepo.save(amb);
        } else {
            throw new RuntimeException("Ambulance not found");
        }
    }
    public List<Ambulance> getAll() {
        return ambulanceRepo.findAll();
    }

}

