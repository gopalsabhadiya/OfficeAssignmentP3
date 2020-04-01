package com.airline.consumer.controller;

import com.airline.consumer.dto.FlightDto;
import com.airline.consumer.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/getflights")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @GetMapping
    public List<FlightDto> getFlights(@RequestParam(name = "pricelt", required = false) Double priceLt, @RequestParam(name = "hopslt", required = false) Integer hopsLt){
        if(priceLt == null)
            priceLt = Double.MAX_VALUE;
        if(hopsLt == null)
            hopsLt = Integer.MAX_VALUE;
        return flightService.getAllFlights(priceLt, hopsLt);
    }
}
