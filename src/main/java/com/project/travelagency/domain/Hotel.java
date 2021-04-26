package com.project.travelagency.domain;

import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@NoArgsConstructor
@Setter
@Entity(name = "hotel")
public class Hotel {
    @Id
    @GeneratedValue
    @Column(name = "HOTEL_ID", unique = true)
    private Long hotelId;

    @Column
    private String nameOfHotelChain;

    @Column
    private Integer capacity;

    @Column
    private boolean isHigherStandard;

    @ManyToMany(cascade = CascadeType.ALL, mappedBy = "hotelList")
    private List<Travel> travelList;

    public Hotel(Long hotelId, String nameOfHotelChain, Integer capacity, boolean isHigherStandard, List<Travel> travelList) {
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
