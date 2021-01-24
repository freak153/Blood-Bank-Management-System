package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.DonationCamp;
import com.example.demo.service.DonationCampService;

@RestController
@RequestMapping(path="/donationcampservice")
@CrossOrigin(origins = "*")
public class DonationCampController {

	@Autowired
	private DonationCampService service;
	
	@GetMapping(path="/")
	@ResponseStatus(value=HttpStatus.OK)
	public List<DonationCamp> findAll(){
		return this.service.findAll();
	}
	
	@PostMapping(path="/")
	@ResponseStatus(value=HttpStatus.CREATED)
	public DonationCamp addDonationCamp(@RequestBody DonationCamp entity) {
		return this.service.addDonationCamp(entity);
	}
	
	@PutMapping(path="/")
	@ResponseStatus(value=HttpStatus.CREATED)
	public DonationCamp updateDonationCamp(@RequestBody DonationCamp entity) {
		return this.service.addDonationCamp(entity);
	}
	
	@GetMapping(path ="/ids/{id}")
    public ResponseEntity<List<DonationCamp>> findByCampId(@PathVariable String id){
		
		List<DonationCamp> resp =this.service.findByCampId(id);
		
		 return ResponseEntity.ok().body(resp);
			
	}
	
	@GetMapping(path ="/locations/{location}")
    public List<DonationCamp> findByLocation(@PathVariable String location){
		
		return this.service.findByLocation(location);	
	}
	
	@GetMapping(path ="/names/{name}")
    public List<DonationCamp> findByName(@PathVariable String name){
		return this.service.findByName(name);	
	}

	@GetMapping(path ="/activecamp")
    public List<DonationCamp> findActiveCamp(){
		return this.service.findActiveCamp();	
	}
}
