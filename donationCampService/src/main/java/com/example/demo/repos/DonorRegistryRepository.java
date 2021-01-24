package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.DonorRegistry;


public interface DonorRegistryRepository extends JpaRepository<DonorRegistry, String> {

	List<DonorRegistry> findByRegistrationId(String id);
	
	List<DonorRegistry> findByCampId(String id);
	
	List<DonorRegistry> findByDonorId(String id);
	
	
}
