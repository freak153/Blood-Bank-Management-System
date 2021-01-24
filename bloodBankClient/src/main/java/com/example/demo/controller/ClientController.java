package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.DonationCamp;
import com.example.demo.entity.DonorRegistry;

@Controller

@CrossOrigin(origins = "*")
public class ClientController {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private ModelAndView mdlView;

	
	@GetMapping(path="/")
	public ModelAndView init() {
		
		DonorRegistry[] donReg =restTemplate.getForObject("http://localhost:2020/donation-camp-service/donorRegistry/", DonorRegistry[].class);
		int count=donReg.length;
		mdlView.addObject("donReg", donReg);
		mdlView.addObject("count", count);
		mdlView.setViewName("home");
		
		return mdlView;		
	}
	
	@GetMapping(path="/donor/")
	public ModelAndView donors() {
		mdlView.setViewName("donor");
		
		return mdlView;		
	}
	
	
	@GetMapping(path="/registerDonor/")
	public ModelAndView registerDonor() {
		
		mdlView.setViewName("register");
		return mdlView;		
	}
	
	@GetMapping(path="/donationcamp/")
	public ModelAndView donationcamp() {
		DonationCamp[] active =restTemplate.getForObject("http://localhost:2020/donation-camp-service/donationcampservice/activecamp", DonationCamp[].class);
		int count=active.length;
		mdlView.addObject("active", active);
		mdlView.addObject("count", count);
		mdlView.setViewName("donationCamp");
		
		return mdlView;		
	}
	
	
}
