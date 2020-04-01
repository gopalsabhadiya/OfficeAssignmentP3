package com.airline.host.controller;

import com.airline.host.entity.Flight;
import com.airline.host.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flight")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @GetMapping
    public List<Flight> getAllFlights(){
        return flightService.getAllFlights();
    }
}
