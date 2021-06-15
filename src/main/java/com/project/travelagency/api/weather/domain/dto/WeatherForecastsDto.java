package com.project.travelagency.api.weather.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class WeatherForecastsDto {
    private List<DailyWeatherForecastsDto> weatherForecasts;
    private String city;

    public List<DailyWeatherForecastsDto> getWeatherForecasts() {
        return weatherForecasts;
    }

    public String getCity() {
        return city;
    }
}
