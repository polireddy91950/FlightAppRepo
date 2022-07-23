package com.flightapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.flightapp.dto.FlightDto;
import com.flightapp.dto.FlightSearchDto;
import com.flightapp.dto.FlightSearchResultDto;
import com.flightapp.service.FlightService;

@RestController
public class FlightServicelController {

	@Autowired
	private FlightService flightService;

	@PostMapping("/airline/inventory/add")
	public ResponseEntity<FlightDto> addInventory(FlightDto flightDto) {
		return ResponseEntity.status(HttpStatus.OK).body(flightService.save(flightDto));
	}

	@PostMapping("/airline/search")
	public ResponseEntity<List<FlightSearchResultDto>> search(FlightSearchDto flightSearchDto) {
		return ResponseEntity.status(HttpStatus.OK).body(flightService.search(flightSearchDto));
	}
}
