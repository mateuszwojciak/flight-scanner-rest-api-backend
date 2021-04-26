package com.project.travelagency.mapper;

import com.project.travelagency.domain.Flight;
import com.project.travelagency.domain.FlightDto;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

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
                flightDto.getPlaneNumber(),
                flightDto.getTravelList()
        );
    }

    public List<Flight> mapToFlightList(final List<FlightDto> flightDtoList) {
        return flightDtoList.stream()
                .map(flightDto -> new Flight(
                        flightDto.getFlightId(),
                        flightDto.getOrigin(),
                        flightDto.getDestination(),
                        flightDto.getPrice(),
                        flightDto.getStartFlightDate(),
                        flightDto.getEndFlightDate(),
                        flightDto.getPlaneNumber(),
                        flightDto.getTravelList()))
                .collect(toList());

    }

    public FlightDto mapToFlightDto(final Flight flight) {
        return new FlightDto(
                flight.getFlightId(),
                flight.getOrigin(),
                flight.getDestination(),
                flight.getPrice(),
                flight.getStartFlightDate(),
                flight.getEndFlightDate(),
                flight.getPlaneNumber(),
                flight.getTravelList()
        );
    }

    public List<FlightDto> mapToFlightDtoList(final List<Flight> flightList) {
        return flightList.stream()
                .map(flight -> new FlightDto(
                        flight.getFlightId(),
                        flight.getOrigin(),
                        flight.getDestination(),
                        flight.getPrice(),
                        flight.getStartFlightDate(),
                        flight.getEndFlightDate(),
                        flight.getPlaneNumber(),
                        flight.getTravelList()))
                .collect(toList());
    }
}
