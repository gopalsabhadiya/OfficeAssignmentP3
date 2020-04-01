package com.airline.consumer.connector;

import com.airline.consumer.entity.Flight;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class FlightConnector {

    @Value("${airline.sg.flightendpoint}")
    private String sgflight;
    @Value("${airline.ig.flightendpoint}")
    private String igflight;

    String base64Creds = Base64.getEncoder().encodeToString("root:root".getBytes());

    private final RestTemplate restTemplate;

    public FlightConnector(RestTemplateBuilder restTemplateBuilder){
        this.restTemplate = restTemplateBuilder.build();
    }

    public List<Flight> getAllFlights(){
        List<Flight> finalList = null;
        HttpHeaders authHeader = new HttpHeaders();
        authHeader.add("Authorization", "Basic " + base64Creds);

        try {
            URI uriIg = new URI(igflight);
            URI uriSg = new URI(sgflight);
            ResponseEntity<Flight[]> responseIg =  this.restTemplate.exchange(uriIg, HttpMethod.GET,new HttpEntity<Flight>(authHeader),Flight[].class);
            ResponseEntity<Flight[]> responseSg =  this.restTemplate.exchange(uriSg, HttpMethod.GET,new HttpEntity<Flight>(authHeader),Flight[].class);
            List<Flight> flightsIg = Arrays.asList(responseIg.getBody());
            List<Flight> flightsSg = Arrays.asList(responseSg.getBody());
            finalList = Stream.concat(flightsIg.stream(), flightsSg.stream()).collect(Collectors.toList());
        }catch (URISyntaxException e){
            e.printStackTrace();
        }
        return finalList;
    }

}
