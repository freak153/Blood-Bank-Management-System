package com.example.demo.entity;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DonationCamp {

	private String campId;
	private String name;
	private LocalDate startDate;
	private LocalDate endDate;
	private String location;
}
