package com.project.travelagency.domain.dto;

import com.project.travelagency.domain.Travel;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@EqualsAndHashCode
public class HotelDto {
    private Long hotelId;
    private String nameOfHotelChain;
    private Integer capacity;
    private boolean isHigherStandard;
    private List<Travel> travelList;

    public HotelDto(Long hotelId, String nameOfHotelChain, Integer capacity, boolean isHigherStandard, List<Travel> travelList) {
        this.hotelId = hotelId;
        this.nameOfHotelChain = nameOfHotelChain;
        this.capacity = capacity;
        this.isHigherStandard = isHigherStandard;
        this.travelList = travelList;
    }

    public Long getHotelId() {
        return hotelId;
    }

    public String getNameOfHotelChain() {
        return nameOfHotelChain;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public boolean isHigherStandard() {
        return isHigherStandard;
    }

    public List<Travel> getTravelList() {
        return travelList;
    }
}
