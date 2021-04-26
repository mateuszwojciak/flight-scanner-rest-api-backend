package com.project.travelagency.domain;

import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@Setter
@Entity(name = "travel")
public class Travel {
    @Id
    @GeneratedValue
    @Column(name = "TRAVEL_ID", unique = true)
    private Long travelId;

    @Column
    private String tripName;

    @Column
    private String destination;

    @Column
    private Double price;

    @Column
    private Date startDate;

    @Column
    private Date endDate;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "JOIN_TRAVEL_FLIGHT",
            joinColumns = {@JoinColumn(name = "TRAVEL_ID", referencedColumnName = "TRAVEL_ID")},
            inverseJoinColumns = {@JoinColumn(name = "FLIGHT_ID", referencedColumnName = "FLIGHT_ID")}
    )
    private List<Flight> flightList;

    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "JOIN_TRAVEL_HOTEL",
            joinColumns = {@JoinColumn(name = "TRAVEL_ID", referencedColumnName = "TRAVEL_ID")},
            inverseJoinColumns = {@JoinColumn(name = "HOTEL_ID", referencedColumnName = "HOTEL_ID")}
    )
    private List<Hotel> hotelList;

    @ManyToOne(cascade =  CascadeType.PERSIST)
    @JoinColumn(name = "USER")
    private User user;

    @Column
    private boolean isPaid;

    @Column
    private boolean isHigherStandard;

    public Travel(Long travelId, String tripName, String destination, Double price, Date startDate, Date endDate, List<Flight> flightList, List<Hotel> hotelList, User user, boolean isPaid, boolean isHigherStandard) {
        this.travelId = travelId;
        this.tripName = tripName;
        this.destination = destination;
        this.price = price;
        this.startDate = startDate;
        this.endDate = endDate;
        this.flightList = flightList;
        this.hotelList = hotelList;
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

    public List<Flight> getFlightList() {
        return flightList;
    }

    public List<Hotel> getHotelList() {
        return hotelList;
    }

    public User getUser() {
        return user;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public boolean isHigherStandard() {
        return isHigherStandard;
    }
}
