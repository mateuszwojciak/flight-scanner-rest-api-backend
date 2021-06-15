package com.project.travelagency.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AdminConfig {

    @Value("${weather.api.key}")
    private String weatherApiKey;

    @Value("${weather.api.baseurl}")
    private String weatherApiBaseUrl;

    public String getWeatherApiKey() {
        return weatherApiKey;
    }

    public String getWeatherApiBaseUrl() {
        return weatherApiBaseUrl;
    }
}
