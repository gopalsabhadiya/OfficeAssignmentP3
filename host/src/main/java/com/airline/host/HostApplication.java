package com.airline.host;

import com.airline.host.entity.SeatMatrix;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HostApplication {

	public static void main(String[] args) {
		SeatMatrix sm = new SeatMatrix();
		SpringApplication.run(HostApplication.class, args);
	}

}
