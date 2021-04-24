package com.project.travelagency.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Entity
public class Flight {
    @Id
    @GeneratedValue
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
}
