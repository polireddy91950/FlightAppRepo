package com.flightapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class FlightUserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightUserServiceApplication.class, args);
	}

}
