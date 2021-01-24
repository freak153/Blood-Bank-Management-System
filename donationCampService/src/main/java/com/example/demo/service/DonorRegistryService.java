package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.DonorRegistry;
import com.example.demo.repos.DonorRegistryRepository;

@Service
public class DonorRegistryService {

	@Autowired
	private DonorRegistryRepository repo;


	public List<DonorRegistry> findAll(){
		return this.repo.findAll();
	}

	public DonorRegistry addRegistry(DonorRegistry entity){	

		return this.repo.save(entity);
	}

	public DonorRegistry updateRegistry(DonorRegistry entity){	

		return this.addRegistry(entity);
	}

	public List<DonorRegistry> findByRegistrationId(String id){
		return this.repo.findByRegistrationId(id);
	}
	
	public List<DonorRegistry> findByCampId(String id){
		return this.repo.findByCampId(id);
	}
	
	public List<DonorRegistry> findByDonorId(String id){
		return this.repo.findByDonorId(id);
	}
}
