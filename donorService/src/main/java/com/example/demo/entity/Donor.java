package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="lumen_donors")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Donor {

	@Id
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
