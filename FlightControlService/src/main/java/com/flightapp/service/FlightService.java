package com.flightapp.service;

import java.util.List;

import com.flightapp.dto.FlightDto;
import com.flightapp.dto.FlightSearchDto;
import com.flightapp.dto.FlightSearchResultDto;

public interface FlightService {

	FlightDto save(FlightDto FlightDto);

	List<FlightSearchResultDto> search(FlightSearchDto FlightSearchDto);

}
