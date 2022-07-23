package com.flightapp.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightapp.dao.AirlineDao;
import com.flightapp.dto.AirlineDto;
import com.flightapp.service.AirlineService;

@Service
public class AirlineServiceImpl implements AirlineService {

	private static final String ACTIVE = "ACTIVE";
	// private static final String IN_ACTIVE = "IN_ACTIVE";

	@Autowired
	private AirlineDao airlineDao;

	@Override
	public AirlineDto registerAirline(AirlineDto airlineDto) {
		if (airlineDto.getId() == null) {
			airlineDto.setStatus(ACTIVE);
		}
		AirlineDto dto = airlineDao.exportDto(airlineDao.save(airlineDao.importDto(airlineDto)));
		return dto;
	}

}
