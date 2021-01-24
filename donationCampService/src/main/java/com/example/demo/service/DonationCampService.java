package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.DonationCamp;
import com.example.demo.repos.DonationCampRepository;

@Service
public class DonationCampService {

	@Autowired
	private DonationCampRepository repo;


	public List<DonationCamp> findAll(){
		return this.repo.findAll();
	}

	public DonationCamp addDonationCamp(DonationCamp entity){	

		return this.repo.save(entity);
	}

	public DonationCamp updateDonationCamp(DonationCamp entity){	

		return this.addDonationCamp(entity);
	}


	public List<DonationCamp> findByLocation(String location){
		return this.repo.findByLocation(location);
	}

	public List<DonationCamp> findByName(String name){
		return this.repo.findByName(name);
	}

	public List<DonationCamp> findByCampId(String id) {

		return this.repo.findByCampId(id);
	}
	
	public List<DonationCamp> findActiveCamp(){
		return this.repo.findActiveCamps();
	}

}
