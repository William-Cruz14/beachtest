package com.example.injectiondependence.dto;

import com.example.injectiondependence.dto.weather.*;
import lombok.Data;

import java.util.ArrayList;

@Data
public class WeatherDTO {
    public Summary summary;
    public ArrayList<Forecasts> forecasts;
}