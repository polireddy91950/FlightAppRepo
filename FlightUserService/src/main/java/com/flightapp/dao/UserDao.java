package com.flightapp.dao;

import org.springframework.beans.BeanUtils;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.flightapp.dto.UserDto;
import com.flightapp.model.UserDo;

@Repository
public interface UserDao extends CrudRepository<UserDo, Long> {

	public default UserDo importDto(UserDto dto) {
		UserDo entity = new UserDo();
		BeanUtils.copyProperties(dto, entity);
		return entity;
	}

	public default UserDto exportDto(UserDto entity) {
		UserDto dto = new UserDto();
		BeanUtils.copyProperties(entity, dto);
		return dto;
	}

}
