package com.project.travelagency.domain.dto;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@EqualsAndHashCode
public class TravelDto {
    private Long travelId;
    private String tripName;
    private String destination;
    private Double price;
    private Date startDate;
    private Date endDate;
    private List<FlightDto> flightDtoList;
    private List<HotelDto> hotelDtoList;
    private UserDto user;
    private boolean isPaid;
    private boolean isHigherStandard;

    public TravelDto(Long travelId, String tripName, String destination, Double price, Date startDate, Date endDate, List<FlightDto> flightDtoList, List<HotelDto> hotelDtoList, UserDto user, boolean isPaid, boolean isHigherStandard) {
        this.travelId = travelId;
        this.tripName = tripName;
        this.destination = destination;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
        this.flightDtoList = flightDtoList;
        this.hotelDtoList = hotelDtoList;
        this.user = user;
        this.isPaid = isPaid;
        this.isHigherStandard = isHigherStandard;
    }

    public Long getTravelId() {
        return travelId;
    }

    public String getTripName() {
        return tripName;
    }

    public String getDestination() {
        return destination;
    }

    public Double getPrice() {
        return price;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public List<FlightDto> getFlightDtoList() {
        return flightDtoList;
    }

    public List<HotelDto> getHotelDtoList() {
        return hotelDtoList;
    }

    public UserDto getUser() {
        return user;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public boolean isHigherStandard() {
        return isHigherStandard;
    }
}
