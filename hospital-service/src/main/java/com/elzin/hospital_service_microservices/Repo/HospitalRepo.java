package com.elzin.hospital_service_microservices.Repo;

import com.elzin.hospital_service_microservices.Model.Hospital;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface HospitalRepo extends JpaRepository<Hospital, UUID> {

    List<Hospital> findAllByAvailableBedsGreaterThanAndLocationIgnoreCase(Integer beds, String location);

    @Query(value = """
    SELECT * FROM hospitals
    ORDER BY ST_Distance(
        ST_SetSRID(ST_MakePoint(longitude, latitude),4326),
        ST_SetSRID(ST_MakePoint(:lon,:lat),4326)
    )
    LIMIT 1
    """, nativeQuery = true)
    Hospital findNearest(@Param("lon") double lon, @Param("lat") double lat);




}
