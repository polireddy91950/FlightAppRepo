package com.flightapp.dao;

import org.springframework.beans.BeanUtils;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.flightapp.dto.FlightDto;
import com.flightapp.model.FlightDo;

@Repository
public interface FlightDao extends CrudRepository<FlightDo, Long>,JpaSpecificationExecutor<FlightDo> {
	
	public default FlightDo importDto(FlightDto dto) {
		FlightDo entity = new FlightDo();
		BeanUtils.copyProperties(dto, entity);
		return entity;
	}

	public default FlightDto exportDto(FlightDo entity) {
		FlightDto dto = new FlightDto();
		BeanUtils.copyProperties(entity, dto);
		return dto;
	}

}
