package com.flightapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class TicketDo {

	@Id
	@GeneratedValue
	private Long id;
	private String flightId;
	private String name;
	private String emailId;
	private Integer noOfseats;
	private String meal;
	private Integer seatNo;

}
