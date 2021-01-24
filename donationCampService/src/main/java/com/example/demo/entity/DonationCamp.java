package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="donation_camp")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DonationCamp {

	@Id
	private String campId;
	private String name;
	private LocalDate startDate;
	private LocalDate endDate;
	private String location;
}
