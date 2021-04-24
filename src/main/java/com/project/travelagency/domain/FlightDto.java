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
public class FlightDto {
    private Long flightId;
    private String origin;
    private String destination;
    private Double price;
    private Date startFlightDate;
    private Date endFlightDate;
    private String planeNumber;
}
