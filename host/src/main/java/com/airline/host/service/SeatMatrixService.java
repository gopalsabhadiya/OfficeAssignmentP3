package com.airline.host.service;

import com.airline.host.entity.SeatMatrix;
import com.airline.host.repository.SeatMatrixRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SeatMatrixService {

    @Autowired
    private SeatMatrixRepository seatMatrixRepository;

    public SeatMatrix addSeatMatrix(SeatMatrix seatMatrix) {

        return seatMatrixRepository.save(seatMatrix);

    }

    public List<SeatMatrix> getAllSeatMetrix() {
        return seatMatrixRepository.findAll();
    }
}
