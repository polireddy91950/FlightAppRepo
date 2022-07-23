package com.flightapp.dao;

import org.springframework.beans.BeanUtils;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.flightapp.dto.AirlineDto;
import com.flightapp.model.AirlineDo;

@Repository
public interface AirlineDao extends CrudRepository<AirlineDo, Long> {

	public default AirlineDo importDto(AirlineDto dto) {
		AirlineDo entity = new AirlineDo();
		BeanUtils.copyProperties(dto, entity);
		return entity;
	}

	public default AirlineDto exportDto(AirlineDo entity) {
		AirlineDto dto = new AirlineDto();
		BeanUtils.copyProperties(entity, dto);
		return dto;
	}

}
