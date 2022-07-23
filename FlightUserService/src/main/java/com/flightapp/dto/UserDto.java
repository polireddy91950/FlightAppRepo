package com.flightapp.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDto {

	private Long id;
	private String name;
	private String emailId;
	private Long phoneNumber;

}
