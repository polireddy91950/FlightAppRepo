package com.flightapp.dto;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FlightSearchDto {

	private String fromPlace;

	private String toPlace;

	private Date startDateTime;

	private Date endDateTime;

}
