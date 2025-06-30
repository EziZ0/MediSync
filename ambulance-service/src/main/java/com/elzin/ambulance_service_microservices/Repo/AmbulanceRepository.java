package com.elzin.ambulance_service_microservices.Repo;


import com.elzin.ambulance_service_microservices.Model.Ambulance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface AmbulanceRepository extends JpaRepository<Ambulance, UUID> {

    List<Ambulance> findByLocationIgnoreCaseAndAvailable(String location, String free);
}
