package com.example.demo.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Donor;


@Repository 
public interface DonorRepository extends JpaRepository<Donor, String> {

	List<Donor> findByDonorId(String id);
	
	List<Donor> findByDonorName(String donorname);
	
	List<Donor> findByDonorMobNo(int donorMobNo);
	
	List<Donor> findByBloodGroup(String bloodGroup);
	
	List<Donor> findByLocation(String location);

	@Query(value="select * from lumen_donors where "
			+ " ((datediff(CURDATE(),lastDonated)>180 or lastDonated is null))",nativeQuery=true)
	List<Donor> findAllEligible();

	@Query(value="select * from lumen_donors where bloodGroup=:bGroup and"
			+ " ((datediff(CURDATE(),lastDonated)>180 or lastDonated is null))",nativeQuery=true)
	List<Donor> findByBloodGroupWhoAreEligible(@Param("bGroup")String bloodGroup);

	
//	@Query(value="update lumen_donors set mobNumber=:revisedMob,"
//			+ "location=:revisedlocation,"
//			+ "email=:revisedEmail,"
//			+ "lastDonated=:revisedLastDonated where mobNumber=:mob",nativeQuery=true)
//	@Modifying
//	@Transactional
//	List<Donor> updateDonorInfo(@Param("mob")int mobNumber,@Param("revisedMob")int revisedMobno,
//			@Param("revisedLocation")String revisedLocation ,
//			@Param("revisedEmail")String revisedEmail,
//			@Param("revisedLastDonated")LocalDate revisedLastDonated);
//	

}
