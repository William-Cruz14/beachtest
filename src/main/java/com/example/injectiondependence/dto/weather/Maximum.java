package com.example.injectiondependence.dto.weather;

import lombok.Data;

@Data
public class Maximum {
    private double value;
    private String unit;
    private int unitType;
}