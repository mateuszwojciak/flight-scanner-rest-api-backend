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
                travelDto.getTravelId(),
                travelDto.getTripName(),
                travelDto.getDestination(),
                travelDto.getPrice(),
                travelDto.getStartDate(),
                travelDto.getEndDate(),
                flightMapper.mapToFlightList(travelDto.getFlightDtoList()),
                hotelMapper.mapToHotelList(travelDto.getHotelDtoList()),
                userMapper.mapToUser(travelDto.getUser()),
                travelDto.isPaid(),
                travelDto.isHigherStandard()
        );
    }

    public TravelDto mapToTravelDto(final Travel travel) {
        return new TravelDto(
                travel.getTravelId(),
                travel.getTripName(),
                travel.getDestination(),
                travel.getPrice(),
                travel.getStartDate(),
                travel.getEndDate(),
                flightMapper.mapToFlightDtoList(travel.getFlightList()),
                hotelMapper.mapToHotelDtoList(travel.getHotelList()),
                userMapper.mapToUserDto(travel.getUser()),
                travel.isPaid(),
                travel.isHigherStandard()
        );
    }

    public List<TravelDto> mapToTravelDtoList(final List<Travel> travelList) {
        return travelList.stream()
                .map(this::mapToTravelDto)
                .collect(Collectors.toList());
    }
}
