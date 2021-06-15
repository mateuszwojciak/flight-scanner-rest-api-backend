package com.project.travelagency.api.weather;

import com.project.travelagency.api.weather.domain.dto.WeatherForecastsDto;
import com.project.travelagency.config.AdminConfig;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@Component
@Slf4j
@AllArgsConstructor
public class WeatherClient {
    private final RestTemplate restTemplate;
    private final AdminConfig adminConfig;

    public WeatherForecastsDto getWeatherForecast(String city){
        URI url = UriComponentsBuilder.fromHttpUrl(adminConfig.getWeatherApiBaseUrl())
                .queryParam("key", adminConfig.getWeatherApiKey())
                .queryParam("lang", "en")
                .queryParam("units", "M")
                .queryParam("city", city)
                .build().encode().toUri();

        try{
            WeatherForecastsDto response = restTemplate.getForObject(url, WeatherForecastsDto.class);
            return Optional.ofNullable(response).orElse(new WeatherForecastsDto());
        } catch(RestClientException e) {
            log.error(e.getMessage(), e);
            return new WeatherForecastsDto();
        }
    }
}