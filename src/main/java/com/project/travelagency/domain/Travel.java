package com.project.travelagency.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Travel {
    @Id
    @GeneratedValue
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

    @Column
    private Flight flight;

    @Column
    private Hotel hotel;

    @Column
    private User user;

    @Column
    private boolean isPaid;

    @Column
    private boolean isHigherStandard;
}
