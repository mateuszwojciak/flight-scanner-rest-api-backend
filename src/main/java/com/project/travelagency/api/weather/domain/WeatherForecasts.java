package com.project.travelagency.api.weather.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class WeatherForecasts {
    private List<DailyWeatherForecasts> dailyWeatherForecastsList;
    private String city;
}
