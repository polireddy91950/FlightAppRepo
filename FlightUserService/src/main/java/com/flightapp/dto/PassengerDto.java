package com.flightapp.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PassengerDto {

	private Long Id;
	private String Neme;
	private String gender;
	private Integer age;

}
