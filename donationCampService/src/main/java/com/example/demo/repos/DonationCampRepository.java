package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.DonationCamp;

public interface DonationCampRepository extends JpaRepository<DonationCamp, String> {

	List<DonationCamp> findByName(String name);

	List<DonationCamp> findByLocation(String location);
	
	List<DonationCamp> findByCampId(String id);

	@Query(value="select * from donation_camp where datediff(CURDATE(),endDate)<1;",nativeQuery=true)
	List<DonationCamp> findActiveCamps();
	

}
