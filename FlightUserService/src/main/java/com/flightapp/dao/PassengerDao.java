package com.flightapp.dao;

import org.springframework.beans.BeanUtils;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.flightapp.dto.PassengerDto;
import com.flightapp.model.PassengerDo;

@Repository
public interface PassengerDao extends CrudRepository<PassengerDo, Long> {

	public default PassengerDo importDto(PassengerDto dto) {
		PassengerDo entity = new PassengerDo();
		BeanUtils.copyProperties(dto, entity);
		return entity;
	}

	public default PassengerDto exportDto(PassengerDo entity) {
		PassengerDto dto = new PassengerDto();
		BeanUtils.copyProperties(entity, dto);
		return dto;
	}

}
