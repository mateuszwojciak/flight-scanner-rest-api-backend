package com.project.travelagency.mapper;

import com.project.travelagency.domain.Hotel;
import com.project.travelagency.domain.dto.HotelDto;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class HotelMapper {
    public Hotel mapToHotel(final HotelDto hotelDto) {
        return new Hotel(
                hotelDto.getHotelId(),
                hotelDto.getNameOfHotelChain(),
                hotelDto.getCapacity(),
                hotelDto.isHigherStandard(),
                hotelDto.getTravelList()
        );
    }

    public List<Hotel> mapToHotelList(final List<HotelDto> hotelDtoList) {
        return hotelDtoList.stream()
                .map(hotelDto -> new Hotel(
                        hotelDto.getHotelId(),
                        hotelDto.getNameOfHotelChain(),
                        hotelDto.getCapacity(),
                        hotelDto.isHigherStandard(),
                        hotelDto.getTravelList()))
                .collect(toList());
    }

    public HotelDto mapToHotelDto(final Hotel hotel) {
        return new HotelDto(
                hotel.getHotelId(),
                hotel.getNameOfHotelChain(),
                hotel.getCapacity(),
                hotel.isHigherStandard(),
                hotel.getTravelList()
        );
    }

    public List<HotelDto> mapToHotelDtoList(final List<Hotel> hotelList) {
        return hotelList.stream()
                .map(hotel -> new HotelDto(
                        hotel.getHotelId(),
                        hotel.getNameOfHotelChain(),
                        hotel.getCapacity(),
                        hotel.isHigherStandard(),
                        hotel.getTravelList()))
                .collect(toList());
    }
}