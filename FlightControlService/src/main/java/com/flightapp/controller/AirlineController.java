package com.flightapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightapp.dto.AirlineDto;
import com.flightapp.service.AirlineService;

@RestController
public class AirlineController {

	@Autowired
	private AirlineService airlineService;

	@PostMapping("/airline/register")
	public ResponseEntity<AirlineDto> registerAirline(AirlineDto airlineDto) {
		return ResponseEntity.status(HttpStatus.OK).body(airlineService.registerAirline(airlineDto));
	}

}
