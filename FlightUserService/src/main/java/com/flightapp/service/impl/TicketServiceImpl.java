package com.flightapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.flightapp.dao.PassengerDao;
import com.flightapp.dao.TicketDao;
import com.flightapp.dto.BookingResultDto;
import com.flightapp.dto.TicketDto;
import com.flightapp.service.TicketService;

public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketDao ticketDao;

	@Autowired
	private PassengerDao passengerDao;

	@Override
	public BookingResultDto bookTicket(TicketDto ticketDto) {

		return null;
	}

}
