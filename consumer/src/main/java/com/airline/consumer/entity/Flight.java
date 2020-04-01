package com.airline.consumer.entity;

import com.airline.consumer.entity.enums.FlightStatus;
import lombok.Data;
import lombok.ToString;

@Data
public class Flight {
    private Integer id;
    private FlightStatus status;
    private String flightName;
    private Double price;
    private Integer noOfHops;
    private SeatMatrix seatMatrix;
}
