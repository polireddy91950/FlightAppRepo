package com.flightapp.dto;

import java.util.List;

import com.flightapp.model.PassengerDo;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class TicketDto {

	private Long id;
	private String flightId;
	private String name;
	private String emailId;
	private Integer noOfseatsBook;
	private PassengerDo passengerDeatiles;
	private String meal;
	private Integer seatNo;
	private List<PassengerDto> passengerDtoList;
}
