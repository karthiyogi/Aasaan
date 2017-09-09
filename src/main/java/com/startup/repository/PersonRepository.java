package com.startup.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

import com.startup.model.Person;


public interface PersonRepository extends MongoRepository<Person, String> {

	//List<Person> findByLastName(@Param("name") String name);

}

