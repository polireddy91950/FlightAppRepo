package com.flightapp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class PassengerDo {

	@Id
	@GeneratedValue
	private Long Id;
	private String name;
	private String gender;
	private Integer age;

}
