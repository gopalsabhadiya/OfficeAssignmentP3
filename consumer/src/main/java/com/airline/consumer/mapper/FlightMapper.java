package com.airline.consumer.mapper;

import com.airline.consumer.dto.FlightDto;
import com.airline.consumer.entity.Flight;
import org.mapstruct.Mapper;

@Mapper(uses = SeatMatrixMapper.class)
public interface FlightMapper {
    FlightDto flightToFlightDto(Flight flight);
}
