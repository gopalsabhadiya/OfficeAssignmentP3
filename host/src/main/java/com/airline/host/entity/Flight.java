package com.airline.host.entity;

import com.airline.host.entity.enums.FlightStatus;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Data
@Entity
@Table
public class Flight {

    @Id
    private Integer id;
    private FlightStatus status;
    private String flightName;
    private Double price;
    private Integer noOfHops;

    @OneToOne
    private SeatMatrix seatMatrix;
}
