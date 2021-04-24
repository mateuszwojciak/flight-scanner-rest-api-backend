package com.project.travelagency.mapper;

import com.project.travelagency.domain.Flight;
import com.project.travelagency.domain.FlightDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FlightMapper {
    public Flight mapToFlight(final FlightDto flightDto) {
        return new Flight(
                flightDto.getFlightId(),
                flightDto.getOrigin(),
                flightDto.getDestination(),
                flightDto.getPrice(),
                flightDto.getStartFlightDate(),
                flightDto.getEndFlightDate(),
                flightDto.getPlaneNumber()
        );
    }

    public FlightDto mapToFlightDto(final Flight flight) {
        return new FlightDto(
                flight.getFlightId(),
                flight.getOrigin(),
                flight.getDestination(),
                flight.getPrice(),
                flight.getStartFlightDate(),
                flight.getEndFlightDate(),
                flight.getPlaneNumber()
        );
    }

    public List<FlightDto> mapToFlightDtoList(final List<Flight> flightList) {
        return flightList.stream()
                .map(this::mapToFlightDto)
                .collect(Collectors.toList());
    }
}
