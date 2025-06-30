package com.elzin.ambulance_service_microservices.Controller;
import com.elzin.ambulance_service_microservices.Model.Ambulance;
import com.elzin.ambulance_service_microservices.Service.AmbulanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/ambulances")
public class AmbulanceController {

    @Autowired
    private AmbulanceService ambulanceService;

    @PostMapping
    public ResponseEntity<String> registerAmbulance(@RequestBody Ambulance ambulance) {
        UUID id = ambulanceService.saveAmbulance(ambulance);
        return ResponseEntity.ok("Ambulance registered with ID: " + id);
    }

    @GetMapping("/available/{location}")
    public List<Ambulance> getAvailable(@PathVariable String location) {
        return ambulanceService.findAvailable(location);
    }

    @PutMapping("/{id}/status")
    public ResponseEntity<String> updateStatus(@PathVariable UUID id) {
        ambulanceService.updateAvailability(id);
        return ResponseEntity.ok("Ambulance status updated");
    }
    @GetMapping
    public List<Ambulance> allAmbulances() {
        return ambulanceService.getAll();
    }


}