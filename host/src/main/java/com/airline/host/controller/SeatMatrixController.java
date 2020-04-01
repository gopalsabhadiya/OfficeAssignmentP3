package com.airline.host.controller;

import com.airline.host.entity.SeatMatrix;
import com.airline.host.service.SeatMatrixService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/seatmatrix")
public class SeatMatrixController {

    @Autowired
    private SeatMatrixService seatMatrixService;

    @GetMapping
    public List<SeatMatrix> getDemoSeatMatrix(){
        return seatMatrixService.getAllSeatMetrix();
    }

    @PostMapping
    public SeatMatrix saveSeatMatrix(@RequestBody SeatMatrix seatMatrix){

        return seatMatrixService.addSeatMatrix(seatMatrix);
    }
}
