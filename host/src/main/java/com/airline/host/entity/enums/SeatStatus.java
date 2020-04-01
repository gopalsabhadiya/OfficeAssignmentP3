package com.airline.host.entity.enums;

public enum SeatStatus {
    AVAILABLE("Available"),
    BOOKED("Booked"),
    CANCELLED("Available");

    private String value;

    SeatStatus(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
