package com.example.demo.entity;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DonorRegistry {

	private String registrationId;
	private String campId;
	private String donorId;
	private Date currentDate;
}
