package com.example.injectiondependence.dto;

import com.example.injectiondependence.dto.geocoding.Feature;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeocodingDTO {

        private String type;
        private List<Feature> features;
}