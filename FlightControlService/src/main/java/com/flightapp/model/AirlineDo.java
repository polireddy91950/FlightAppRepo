package com.flightapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class AirlineDo {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String status;

}
