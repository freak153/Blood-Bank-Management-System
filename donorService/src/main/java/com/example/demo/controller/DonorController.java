package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Donor;
import com.example.demo.service.DonorService;


@RestController
@RequestMapping(path="/donorservice/")
@CrossOrigin(origins="*")
public class DonorController {

	@Autowired
	private DonorService service;

	@GetMapping(path="donors")
	public List<Donor> findAll()
	{
		return this.service.findAll();
	}

	@PostMapping(path="donors")
	@ResponseStatus(value=HttpStatus.CREATED)
	public Donor addDonor(@RequestBody Donor donor)
	{
		return this.service.addDonor(donor);

	}


	@DeleteMapping(path ="donors/{id}")
	@ResponseStatus(value=HttpStatus.CREATED)
	public int deleteDonor(@PathVariable String id) {
		
		List<Donor> donor=this.service.findByDonorId(id);
		if(!donor.isEmpty()) {
			return this.service.deleteDonor(id);
		}
		else
			return 0;

	}

	@PutMapping(path ="donors")
	@ResponseStatus(value=HttpStatus.CREATED)
	public Donor update(@RequestBody Donor entity) {
		
		return  this.service.addDonor(entity);
			
	}
	@GetMapping(path="donors/donorid/{id}")
	public List<Donor> findByDonorId(@PathVariable("id")String id) {
		return this.service.findByDonorId(id);
	}

	@GetMapping(path="donors/{donorMobNo}")
	public List<Donor> findByDonorMobNo(@PathVariable("donorMobNo") int donorMobNo)
	{
		return this.service.findByDonorMobNo(donorMobNo);
	}
	
	@GetMapping(path="donors/donorname/{name}")
	public List<Donor> findByDonorName(@PathVariable("name")String donorname) {
		return this.service.findByDonorName(donorname);
	}

	@GetMapping(path="donors/bloodGroup/{bgroup}") 
	public	List<Donor> findByBloodGroup(@PathVariable("bgroup")String bloodGroup){
		return this.service.findByBloodGroup(bloodGroup);
	}


	@GetMapping(path="donors/location/{loc}")
	public	List<Donor> findByLocation(@PathVariable("loc")String location){
		return this.service.findByLocation(location);
	}

	@GetMapping(path="donors/eligible")
	public List<Donor> findAllEligible(){
		return this.service.findAllEligible();
	}
	
	@GetMapping(path="donors/eligible/bloodGroup/{bgroup}")
	public List<Donor> findByBloodGroupWhoAreEligible(@PathVariable("bgroup")String bloodGroup){
		return this.service.findByBloodGroupWhoAreEligible(bloodGroup);
	}

//	@PutMapping(path="donors/DonorInfo/{mobNumber}/{revisedMobno}/"
//			+ "{revisedLocation}/{revisedEmail}/{revisedLastDonated}")
//	public List<Donor> updateDonorInfo(int mobNumber,int revisedMobno,
//			String revisedLocation ,
//			String revisedEmail,
//			LocalDate revisedLastDonated){
//		return this.service.updateDonorInfo(mobNumber, revisedMobno,  revisedLocation, revisedEmail, revisedLastDonated);
//	}


}
