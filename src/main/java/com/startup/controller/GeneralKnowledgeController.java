package com.startup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.startup.model.Person;
import com.startup.service.PersonService;

@RestController
@RequestMapping("api/v1/")
public class GeneralKnowledgeController {

	@Autowired
	public PersonService personService;
	
	@RequestMapping(value="getValue" ,  method = RequestMethod.GET)
	public List<Person> getValue(){
		
		return personService.findAll();
	}
	
}
