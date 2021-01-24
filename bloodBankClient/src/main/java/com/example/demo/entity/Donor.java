package com.example.demo.entity;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Donor {

	private String donorId;
	private int donorMobNo;
	private String donorName;
	private String gender;
	private String location;
	private String bloodGroup;
	private String email;
	private LocalDate dateOfBirth;
	private LocalDate lastDonated;
}
