package com.project.travelagency.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class HotelDto {
    private Long hotelId;
    private String nameOfHotelChain;
    private Integer capacity;
    private boolean isHigherStandard;
}
