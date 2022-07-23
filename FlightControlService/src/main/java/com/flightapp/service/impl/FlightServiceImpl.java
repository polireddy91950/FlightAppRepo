package com.flightapp.service.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flightapp.dao.FlightDao;
import com.flightapp.dto.FlightDto;
import com.flightapp.dto.FlightSearchDto;
import com.flightapp.dto.FlightSearchResultDto;
import com.flightapp.model.FlightDo;
import com.flightapp.service.FlightService;

@Service
public class FlightServiceImpl implements FlightService {

	@Autowired
	private FlightDao flightDao;

	@Override
	public FlightDto save(FlightDto FlightDto) {
		FlightDo e = flightDao.save(flightDao.importDto(FlightDto));
		return flightDao.exportDto(e);
	}

	@Override
	public List<FlightSearchResultDto> search(FlightSearchDto FlightSearchDto) {
		List<FlightSearchResultDto> resultList = new LinkedList<>();
		List<FlightDo> flightDoList = (List<FlightDo>) flightDao.findAll();
		for (FlightDo f : flightDoList) {
			FlightSearchResultDto flightSearchResultDto = new FlightSearchResultDto();
			BeanUtils.copyProperties(f, flightSearchResultDto);
			flightSearchResultDto.setAirlineName("");
			flightSearchResultDto.setFlightSchduledId(Long.valueOf(1));
			resultList.add(flightSearchResultDto);
		}
		return resultList;
	}

}
