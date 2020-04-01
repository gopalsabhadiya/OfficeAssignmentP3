package com.airline.consumer.service;

import com.airline.consumer.connector.FlightConnector;
import com.airline.consumer.dto.FlightDto;
import com.airline.consumer.mapper.FlightMapper;
import com.airline.consumer.util.FlightComparator;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class FlightService {

    @Autowired
    private FlightConnector flightConnector;

    public List<FlightDto> getAllFlights(Double priceLt, Integer hopsLt) {
        return flightConnector.getAllFlights().stream()
                .map(
                        flight -> Mappers.getMapper(FlightMapper.class).flightToFlightDto(flight)
                )
                .filter(flightDto -> flightDto.getPrice()<priceLt)
                .filter(flightDto -> flightDto.getNoOfHops()<hopsLt)
                .sorted(new FlightComparator())
                .collect(Collectors.toList());
    }
}
