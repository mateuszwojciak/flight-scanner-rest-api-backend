package com.project.travelagency.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@EqualsAndHashCode
public class TravelDto {
    private Long id;
    private String tripName;
    private Double price;
    private Date startDate;
    private Date endDate;
    private Flight flight;
    private Hotel hotel;
    private User user;
    private boolean isPaid;
    private boolean isHigherStandard;
}
