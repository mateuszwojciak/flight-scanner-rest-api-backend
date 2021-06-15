package com.project.travelagency.api.weather.mapper;

import com.project.travelagency.api.weather.domain.DailyWeatherForecasts;
import com.project.travelagency.api.weather.domain.dto.DailyWeatherForecastsDto;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class DailyWeatherForecastsMapper {
    private DailyWeatherForecasts mapToDailyWeatherForecasts (DailyWeatherForecastsDto dto) {
        return DailyWeatherForecasts.builder()
                .maxTemperature(dto.getMaxTemperature())
                .minTemperature(dto.getMinTemperature())
                .expectedTemperature(dto.getExpectedTemperature())
                .date(LocalDate.parse(dto.getDate()))
                .build();
    }

    public List<DailyWeatherForecasts> mapToDailyWeatherForecastList (List<DailyWeatherForecastsDto> dtoList) {
        return dtoList.stream()
                .map(this::mapToDailyWeatherForecasts)
                .collect(Collectors.toList());
    }
}
