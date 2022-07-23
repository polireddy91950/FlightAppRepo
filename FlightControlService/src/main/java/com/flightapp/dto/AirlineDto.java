package com.flightapp.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class AirlineDto {

	private Long id;
	private String name;
	private String status;

}
