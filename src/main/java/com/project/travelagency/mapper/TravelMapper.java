package com.project.travelagency.mapper;

import com.project.travelagency.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TravelMapper {
    FlightMapper flightMapper;
    HotelMapper hotelMapper;
    UserMapper userMapper;

    public Travel mapToTravel(final TravelDto travelDto) {
        return new Travel(
                travelDto.getId,
                travelDto.getTripName,
                travelDto.getPrice,
                travelDto.getStartDate,
                travelDto.getEndDate,
                flightMapper.mapToFlight(travelDto.getFlightDto),
                hotelMapper.mapToHotel(travelDto.getHotelDto),
                userMapper.mapToUser(travelDto.getUserDto),
                travelDto.getIsPaid,
                travelDto.getIsHigherStandard
        );
    }

    public TravelDto mapToTravelDto(final Travel travel) {
        return new TravelDto(
                travel.getId,
                travel.getTripName,
                travel.getPrice,
                travel.getStartDate,
                travel.getEndDate,
                flightMapper.mapToFlightDto(travel.getFlight),
                hotelMapper.mapToHotelDto(travel.getHotel),
                userMapper.mapToUserDto(travel.getUser),
                travel.getIsPaid,
                travel.getIsHigherStandard
        );
    }

    public List<TravelDto> mapToTravelDtoList(final List<Travel> travelList) {
        return travelList.stream()
                .map(this::mapToTravelDto)
                .collect(Collectors.toList());
    }
}
