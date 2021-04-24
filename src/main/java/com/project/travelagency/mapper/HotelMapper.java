package com.project.travelagency.mapper;

import com.project.travelagency.domain.Hotel;
import com.project.travelagency.domain.HotelDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class HotelMapper {
    public Hotel mapToHotel(final HotelDto hotelDto) {
        return new Hotel(
                hotelDto.getHotelId,
                hotelDto.getNameOfHotelChain,
                hotelDto.getCapacity,
                hotelDto.getIsHigherStandard
        );
    }

    public HotelDto mapToHotelDto(final Hotel hotel) {
        return new HotelDto(
                hotel.getHotelId,
                hotel.getNameOfHotelChain,
                hotel.getCapacity,
                hotel.getIsHigherStandard
        );
    }

    public List<HotelDto> mapToHotelDtoList(final List<Hotel> hotelList) {
        return hotelList.stream()
                .map(this::mapToHotelDto)
                .collect(Collectors.toList());
    }
}
