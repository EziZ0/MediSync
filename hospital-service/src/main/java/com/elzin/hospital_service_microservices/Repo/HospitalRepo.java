package com.elzin.hospital_service_microservices.Repo;

import com.elzin.hospital_service_microservices.Model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface HospitalRepo extends JpaRepository<Hospital, UUID> {
    List<Hospital> findAllBySpecialityIgnoreCase(String speciality);

    List<Hospital> findAllByAvailableBedsGreaterThanAndLocationIgnoreCase(Integer beds, String location);
}
