package com.example.docker.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.docker.entities.Products;
import com.example.docker.repos.ProductRespository;

@RestController
public class SampleTest {
	
	@Autowired
	ProductRespository repository;	
	
	@RequestMapping(value="/orders", method=RequestMethod.GET)

	public String hello()
	{
		return "Hello World";
	}
	
	
	@RequestMapping(value="/products/{code}", method=RequestMethod.GET)
	 
	  public Products getProductbyId(@PathVariable("code")long code)
	{ 
		return repository.findById(code).get(); 
	  
	}

}
