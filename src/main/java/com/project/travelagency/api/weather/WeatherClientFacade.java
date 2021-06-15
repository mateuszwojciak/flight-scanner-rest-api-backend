package com.project.travelagency.api.weather;

import com.project.travelagency.api.weather.domain.WeatherForecasts;
import com.project.travelagency.api.weather.mapper.WeatherForecastsMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class WeatherClientFacade {
    private final WeatherClient weatherClient;
    private final WeatherForecastsMapper weatherForecastMapper;

    public WeatherForecasts getWeatherForecasts(String city) {
        return weatherForecastMapper.mapToWeatherForecasts( weatherClient.getWeatherForecast(city) );
    }
}