package com.airline.host.entity.enums;

public enum FlightStatus {
    ONTIME("On Time"),
    DELAYED("Delayed"),
    CANCELLED("Cancelled");

    private String value;

    FlightStatus(String value) {
        this.value = value;
    }

    public String getValue(){
        return this.value;
    }
}
