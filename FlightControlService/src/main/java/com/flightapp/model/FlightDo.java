package com.flightapp.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class FlightDo {

	@Id
	@GeneratedValue
	private Long id;

	private String flightNumber;

	private String fromPlace;

	private String toPlace;

	@Temporal(TemporalType.TIMESTAMP)
	private Date startDateTime;

	@Temporal(TemporalType.TIMESTAMP)
	private Date endDateTime;

	private Integer bizClassSeatCount;

	private Integer nonBizClassSeatConnt;

	private Double cost;

	private String meal;

	private Integer noOfRows;

}
