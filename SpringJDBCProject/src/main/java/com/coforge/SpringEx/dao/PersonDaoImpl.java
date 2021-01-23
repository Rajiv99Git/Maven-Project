package com.coforge.SpringEx.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.coforge.SpringEx.SpringJDBCProject.entity.Person;



@Repository //mentions that the class provides the mechanism 
//for database CRUD operations on Objects 
@Qualifier("personDao") //qualifier mentions that if we have same name of id to avoid 
//the conflict of same names we use @Qualifier 
public class PersonDaoImpl implements PersonDao { 
	
	@Autowired 
	JdbcTemplate jdbcTemplate; 
	public void addPerson(Person person) { 
		jdbcTemplate.update("INSERT INTO person (person_id, first_name," 
	+ " last_name, age) VALUES (?, ?, ?, ?)", 
	person.getPersonId(), person.getFname(), person.getLname(), person.getAge()); 
		System.out.println("Person Added!!");
		
	} 
	public void editPerson(Person person, int personld) { 
		jdbcTemplate.update("UPDATE person SET first_name = ? , " 
	+ "last_name = ? , age = ? WHERE person_id = ? ", 
	person.getFname(), person.getLname(), person.getAge(), personld); 
		System.out.println("Person Updated!!"); 
	}
	
	public void deletePerson(int personld) { 
		jdbcTemplate.update("DELETE from person WHERE person_id = ", personld); 
		System.out.println("Person Deleted!!"); 
		
	}
	@SuppressWarnings("unchecked") 
	public Person find(int personId) { 
		@SuppressWarnings("rawtypes") 
		Person person = (Person) jdbcTemplate.queryForObject("SELECT * FROM " + "person where person_id = ? ", new Object[] { personId }, new BeanPropertyRowMapper(Person.class)); 
		return person; 
	}
	@SuppressWarnings("rawtypes") 
	public List <Person> findAll() { 
		@SuppressWarnings("unchecked") 
		List <Person> persons = jdbcTemplate.query("SELECT * FROM person", new BeanPropertyRowMapper(Person.class)); 
		return persons; 
	}
	
}

