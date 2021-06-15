package com.project.travelagency.api.weather.mapper;

import com.project.travelagency.api.weather.domain.WeatherForecasts;
import com.project.travelagency.api.weather.domain.dto.WeatherForecastsDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class WeatherForecastsMapper {
    private final DailyWeatherForecastsMapper dailyWeatherForecastsMapper;

    public WeatherForecasts mapToWeatherForecasts(WeatherForecastsDto dto) {
        return WeatherForecasts.builder()
                .city(dto.getCity())
                .dailyWeatherForecastsList(dailyWeatherForecastsMapper.mapToDailyWeatherForecastList(dto.getWeatherForecasts()))
                .build();
    }
}
