package com.airline.consumer.mapper;

import com.airline.consumer.dto.SeatMatrixDto;
import com.airline.consumer.entity.SeatMatrix;
import org.mapstruct.Mapper;

@Mapper
public interface SeatMatrixMapper {
    SeatMatrixDto seatMatrixToSeatMatrixDto(SeatMatrix seatMatrix);
}
