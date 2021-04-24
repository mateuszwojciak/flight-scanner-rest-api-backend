package com.project.travelagency.controller;

import com.project.travelagency.domain.Flight;
import com.project.travelagency.domain.FlightDto;
import com.project.travelagency.mapper.FlightMapper;
import com.project.travelagency.service.FlightDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/v1")
public class FlightController {
    private final FlightDatabase flightDatabase;
    private final FlightMapper flightMapper;

    @Autowired
    public FlightController(FlightDatabase flightDatabase, FlightMapper flightMapper) {
        this.flightDatabase = flightDatabase;
        this.flightMapper = flightMapper;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/flights")
    public List<FlightDto> getAllFlights() {
        List<Flight> flights = flightDatabase.showAllFlights();
        return flightMapper.mapToFlightDtoList(flights);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/flights/{flightId}")
    public FlightDto getFlight(@PathVariable Long flightId) throws FlightNotFoundException {
        return flightMapper.mapToFlightDto(flightDatabase.showFlight(flightId).orElseThrow(FlightNotFoundException::new));
    }

    @RequestMapping(method = RequestMethod.POST, value = "/flights/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createFlight(@RequestBody FlightDto flightDto) {
        flightDatabase.addFlight(flightMapper.mapToFlight(flightDto));
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/flights/update/{flightId}")
    public FlightDto updateFlight(@RequestBody FlightDto flightDto) {
        Flight flight = flightDatabase.modifyFlight(flightMapper.mapToFlight(flightDto));
        return flightMapper.mapToFlightDto(flight);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/flights/delete/{flightId}")
    public void deleteFlight(@PathVariable Long flightId) {
        flightDatabase.removeFlight(flightId);
    }
}
