package com.flightapp.service;

import com.flightapp.dto.BookingResultDto;
import com.flightapp.dto.TicketDto;

public interface TicketService {
	
	public BookingResultDto bookTicket(TicketDto ticketsDto);

}
