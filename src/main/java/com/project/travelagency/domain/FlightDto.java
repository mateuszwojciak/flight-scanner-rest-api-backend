package com.project.travelagency.domain;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@NoArgsConstructor
@EqualsAndHashCode
public class FlightDto {
    private Long flightId;
    private String origin;
    private String destination;
    private Double price;
    private Date startFlightDate;
    private Date endFlightDate;
    private String planeNumber;
    private List<Travel> travelList;

    public FlightDto(Long flightId, String origin, String destination, Double price, Date startFlightDate, Date endFlightDate, String planeNumber, List<Travel> travelList) {
        this.flightId = flightId;
        this.origin = origin;
        this.destination = destination;
        this.price = price;
        this.startFlightDate = startFlightDate;
        this.endFlightDate = endFlightDate;
        this.planeNumber = planeNumber;
        this.travelList = travelList;
    }

    public Long getFlightId() {
        return flightId;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public Double getPrice() {
        return price;
    }

    public Date getStartFlightDate() {
        return startFlightDate;
    }

    public Date getEndFlightDate() {
        return endFlightDate;
    }

    public String getPlaneNumber() {
        return planeNumber;
    }

    public List<Travel> getTravelList() {
        return travelList;
    }
}
