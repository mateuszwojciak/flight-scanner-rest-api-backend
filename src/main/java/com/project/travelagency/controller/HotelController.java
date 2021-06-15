package com.project.travelagency.controller;

import com.project.travelagency.domain.Hotel;
import com.project.travelagency.domain.dto.HotelDto;
import com.project.travelagency.mapper.HotelMapper;
import com.project.travelagency.service.HotelDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/v1")
public class HotelController {
    private final HotelDatabase hotelDatabase;
    private final HotelMapper hotelMapper;

    @Autowired
    public HotelController(HotelDatabase hotelDatabase, HotelMapper hotelMapper) {
        this.hotelDatabase = hotelDatabase;
        this.hotelMapper = hotelMapper;
    }

    @RequestMapping(method = RequestMethod.GET, value = "/hotels")
    public List<HotelDto> getAllHotels() {
        List<Hotel> hotels = hotelDatabase.showAllHotels();
        return hotelMapper.mapToHotelDtoList(hotels);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/hotel/{hotelId}")
    public HotelDto getHotel(@PathVariable Long hotelId) throws HotelNotFoundException {
        return hotelMapper.mapToHotelDto(hotelDatabase.showHotel(hotelId).orElseThrow(HotelNotFoundException::new));
    }

    @RequestMapping(method = RequestMethod.POST, value = "/hotel/add", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createHotel(@RequestBody HotelDto hotelDto) {
        hotelDatabase.addHotel(hotelMapper.mapToHotel(hotelDto));
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/hotel/update/{hotelId}")
    public HotelDto updateHotel(@RequestBody HotelDto hotelDto) {
        Hotel hotel = hotelDatabase.modifyHotel(hotelMapper.mapToHotel(hotelDto));
        return hotelMapper.mapToHotelDto(hotel);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/hotel/delete/{hotelId}")
    public void deleteHotel(@PathVariable Long hotelId) {
        hotelDatabase.removeHotel(hotelId);
    }
}
