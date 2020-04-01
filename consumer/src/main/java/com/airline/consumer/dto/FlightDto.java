package com.airline.consumer.dto;

import lombok.Data;

@Data
public class FlightDto {

    private Integer id;
    private String status;
    private String flightName;
    private Double price;
    private Integer noOfHops;
    private SeatMatrixDto seatMatrix;

}
