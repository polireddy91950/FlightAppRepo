package com.flightapp.dao;

import org.springframework.beans.BeanUtils;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.flightapp.dto.TicketDto;
import com.flightapp.model.TicketDo;

@Repository
public interface TicketDao extends CrudRepository<TicketDo, Long> {

	public default TicketDo importDto(TicketDto dto) {
		TicketDo entity = new TicketDo();
		BeanUtils.copyProperties(dto, entity);
		return entity;
	}

	public default TicketDto exportDto(TicketDo entity) {
		TicketDto dto = new TicketDto();
		BeanUtils.copyProperties(entity, dto);
		return dto;
	}

}
