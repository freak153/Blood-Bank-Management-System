package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.DonorRegistry;
import com.example.demo.service.DonorRegistryService;

@RestController
@RequestMapping(path="/donorRegistry")
@CrossOrigin(origins = "*")
public class DonorRegistryController {

	@Autowired
	private DonorRegistryService service;
	
	@GetMapping(path="/")
	@ResponseStatus(value=HttpStatus.OK)
	public List<DonorRegistry> findAll(){
		return this.service.findAll();
	}
	
	@PostMapping(path="/")
	@ResponseStatus(value=HttpStatus.CREATED)
	public DonorRegistry addEntry(@RequestBody DonorRegistry entity) {
		return this.service.addRegistry(entity);
	}
	
	@PutMapping(path="/")
	@ResponseStatus(value=HttpStatus.CREATED)
	public DonorRegistry updateEntry(@RequestBody DonorRegistry entity) {
		return this.service.addRegistry(entity);
	}
	
	@GetMapping(path="/registrationId/{id}")
	@ResponseStatus(value=HttpStatus.OK)
	public List<DonorRegistry> findByRegistrationId(@PathVariable String id){
		return this.service.findByRegistrationId(id);
	}
	
	@GetMapping(path="/campId/{id}")
	@ResponseStatus(value=HttpStatus.OK)
	public List<DonorRegistry> findByCampId(@PathVariable String id){
		return this.service.findByCampId(id);
	}
	
	@GetMapping(path="/donorId/{id}")
	@ResponseStatus(value=HttpStatus.OK)
	public List<DonorRegistry> findByDonorId(@PathVariable String id){
		return this.service.findByDonorId(id);
	}
	
	
}
