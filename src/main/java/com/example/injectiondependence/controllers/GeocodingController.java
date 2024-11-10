package com.example.injectiondependence.controllers;

import com.example.injectiondependence.services.GeocodingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "https://beachtest.onrender.com")
public class GeocodingController {
    @Autowired
    private GeocodingService geocodingService;

    @GetMapping("/geocode")
    public ResponseEntity<?> geocode(@RequestParam String address){
        try {
            return ResponseEntity.ok(geocodingService.geocodeAddress(address));
        } catch (RuntimeException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
