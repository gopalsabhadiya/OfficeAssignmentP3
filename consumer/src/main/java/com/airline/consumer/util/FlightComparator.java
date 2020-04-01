package com.airline.consumer.util;

import com.airline.consumer.dto.FlightDto;

import java.util.Comparator;

public class FlightComparator implements Comparator<FlightDto> {
    @Override
    public int compare(FlightDto flightDto1, FlightDto flightDto2) {
        if(flightDto1 == null && flightDto2 == null)
            return 0;
        if(flightDto1 == null && flightDto2 != null)
            return -1;
        if(flightDto1 != null && flightDto2 == null)
            return 1;

        int result = 0;
        result = flightDto1.getPrice().compareTo(flightDto2.getPrice());
        if(result == 0)
            result = flightDto1.getNoOfHops().compareTo(flightDto2.getNoOfHops());
        return result;
    }
}
