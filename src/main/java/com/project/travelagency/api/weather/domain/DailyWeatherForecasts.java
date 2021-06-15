package com.project.travelagency.api.weather.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class DailyWeatherForecasts {
    private double minTemperature;
    private double maxTemperature;
    private double expectedTemperature;
    private LocalDate date;

    @Override
    public String toString() {
        return "DailyWeatherForecasts{" +
                "minTemperature=" + minTemperature +
                ", maxTemperature=" + maxTemperature +
                ", expectedTemperature=" + expectedTemperature +
                ", date=" + date +
                '}';
    }
}
