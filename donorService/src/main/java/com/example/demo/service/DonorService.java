package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Donor;
import com.example.demo.repos.DonorRepository;


@Service
public class DonorService {

	@Autowired
	private DonorRepository donorRepo;
	
	public List<Donor> findAll()
	{
		return this.donorRepo.findAll();
	}
	
	public Donor addDonor(Donor entity)
	{
		return this.donorRepo.save(entity);
	}
	
	
	public int deleteDonor(String id) {
		
		if(donorRepo.findById(id).isPresent())  {
		    this.donorRepo.findById(id);
			donorRepo.deleteById(id);
			
		}
		return 0;
	}
	
	 public Donor updateDonor(Donor donor) {
	    	
	    	return this.addDonor(donor);    	
	    }
	 
	 public List<Donor> findByDonorId(String id) {
		 return this.donorRepo.findByDonorId(id);
	 }
	    
	 public List<Donor> findByDonorName(String donorname) {
		 return this.donorRepo.findByDonorName(donorname);
	 }
	 
	 public List<Donor> findByDonorMobNo(int donorMobNo) {
		 return this.donorRepo.findByDonorMobNo(donorMobNo);
	 }
		
	 public	List<Donor> findByBloodGroup(String bloodGroup){
		 return this.donorRepo.findByBloodGroup(bloodGroup);
	 }
		
	 public	List<Donor> findByLocation(String location){
		 return this.donorRepo.findByLocation(location);
	 }
	 
	 public List<Donor> findAllEligible(){
		 return this.donorRepo.findAllEligible();
	 }
	 
	 public List<Donor> findByBloodGroupWhoAreEligible(String bloodGroup){
		 return this.donorRepo.findByBloodGroupWhoAreEligible(bloodGroup);
	 }


	
//	 public List<Donor> updateDonorInfo(int mobNumber,int revisedMobno,
//				String revisedLocation ,
//				String revisedEmail,
//				LocalDate revisedLastDonated){
//		 return this.donorRepo.updateDonorInfo(mobNumber, revisedMobno,  revisedLocation, revisedEmail, revisedLastDonated);
//	 }
}
