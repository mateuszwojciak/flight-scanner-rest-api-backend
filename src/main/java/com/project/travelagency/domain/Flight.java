package com.project.travelagency.domain;

import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@Setter
@Entity
@Table(name = "flight")
public class Flight {
    @Id
    @GeneratedValue
    @Column(name = "FLIGHT_ID", unique = true)
    private Long flightId;

    @Column
    private String origin;

    @Column
    private String destination;

    @Column
    private Double price;

    @Column
    private Date startFlightDate;

    @Column
    private Date endFlightDate;

    @Column
    private String planeNumber;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "flightList")
    private List<Travel> travelList;

    public Flight(Long flightId, String origin, String destination, Double price, Date startFlightDate, Date endFlightDate, String planeNumber, List<Travel> travelList) {
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
