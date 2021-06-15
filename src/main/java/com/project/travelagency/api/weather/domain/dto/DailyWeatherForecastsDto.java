package com.project.travelagency.api.weather.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class DailyWeatherForecastsDto {
    private double minTemperature;
    private double maxTemperature;
    private double expectedTemperature;
    private String date;

    public double getMinTemperature() {
        return minTemperature;
    }

    public double getMaxTemperature() {
        return maxTemperature;
    }

    public double getExpectedTemperature() {
        return expectedTemperature;
    }

    public String getDate() {
        return date;
    }
}
