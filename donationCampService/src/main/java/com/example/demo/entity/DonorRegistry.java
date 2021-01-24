package com.example.demo.entity;



import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="donor_registry")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DonorRegistry {

	@Id
	private String registrationId;
	private String campId;
	private String donorId;
	
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "currentDate")
	private Date currentDate;
	

	
}
