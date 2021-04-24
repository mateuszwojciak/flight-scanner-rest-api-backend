package com.project.travelagency.service;

import com.project.travelagency.domain.Flight;
import com.project.travelagency.repository.FlightRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class FlightDatabase {

    @Autowired
    private final FlightRepository flightRepository;

    public List<Flight> showAllFlights() {
        return flightRepository.findAll();
    }

    public Optional<Flight> showFlight(final Long flightId) {
        return flightRepository.findById(flightId);
    }

    public void addFlight(final Flight flight) {

    }

    public Flight modifyFlight(final Flight flight) {
        return flightRepository.save(flight);
    }

    public void removeFlight(final Long flightId) {
        flightRepository.deleteById(flightId);
    }
}
