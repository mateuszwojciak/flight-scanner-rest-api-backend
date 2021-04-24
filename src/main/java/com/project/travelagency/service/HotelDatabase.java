package com.project.travelagency.service;

import com.project.travelagency.domain.Hotel;
import com.project.travelagency.repository.HotelRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HotelDatabase {

    @Autowired
    private final HotelRepository hotelRepository;

    public List<Hotel> showAllHotels() {
        return hotelRepository.findAll();
    }

    public Optional<Hotel> showHotel(final Long hotelId) {
        return hotelRepository.findById(hotelId);
    }

    public void addHotel(final Hotel hotel) {

    }

    public Hotel modifyHotel(final Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    public void removeHotel(final Long hotelId) {
        hotelRepository.deleteById(hotelId);
    }
}
