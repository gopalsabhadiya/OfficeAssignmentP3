package com.airline.host.service;

import com.airline.host.entity.Flight;
import com.airline.host.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {

    @Autowired
    private FlightRepository flightRepository;


    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }
}
