package com.flightapp.dto;

import java.util.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FlightDto {

	private Long id;

	private String flightNumber;

	private String fromPlace;

	private String toPlace;

	private Date startDateTime;

	private Date endDateTime;

	private Integer bizClassSeatCount;

	private Integer nonBizClassSeatConnt;

	private Double cost;

	private String meal;

	private Integer noOfRows;

}
