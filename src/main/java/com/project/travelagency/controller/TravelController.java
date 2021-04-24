package com.project.travelagency.controller;

import com.project.travelagency.domain.Travel;
import com.project.travelagency.domain.TravelDto;
import com.project.travelagency.mapper.TravelMapper;
import com.project.travelagency.service.TravelDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/v1")
public class TravelController {
    private final TravelDatabase travelDatabase;
    private final TravelMapper travelMapper;

    @Autowired
    public TravelController(TravelDatabase travelDatabase, TravelMapper travelMapper) {
        this.travelDatabase = travelDatabase;
        this.travelMapper = travelMapper;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/travels")
    public List<TravelDto> getAllTravels() {
        List<Travel> travels = travelDatabase.showAllTravels();
        return travelMapper.mapToTravelDtoList(travels);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/travel/{travelId}")
    public TravelDto getTravel(@PathVariable Long travelId) throws TravelNotFoundException {
        return travelMapper.mapToTravelDto(travelDatabase.showTravel(travelId).orElseThrow(TravelNotFoundException::new));
    }

    @RequestMapping(method = RequestMethod.POST, value = "/travel/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createTravel(@RequestBody TravelDto travelDto) {
        travelDatabase.addTravel(travelMapper.mapToTravel(travelDto));
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/travel/update/{travelId}")
    public TravelDto updateTravel(@RequestBody TravelDto travelDto) {
        Travel travel = travelDatabase.modifyTravel(travelMapper.mapToTravel(travelDto));
        return travelMapper.mapToTravelDto(travel);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/travel/delete/{travelId}")
    public void deleteTravel(@PathVariable Long travelId) {
        travelDatabase.removeTravel(travelId);
    }
}