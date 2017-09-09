package com.startup.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.startup.model.Person;
import com.startup.repository.PersonRepository;

@Service("PersonService")
public class PersonSericeImpl implements PersonService{

	@Autowired
	public PersonRepository personRepository;

	@Override
	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return personRepository.findAll();
	}
	
	
}
