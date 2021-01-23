package com.coforge.SpringEx.service;

import java.util.List;

import com.coforge.SpringEx.SpringJDBCProject.entity.Person;

public interface PersonService {

	
	public void addPerson(Person person);
	public void editPerson(Person person, int personID);
	public void deletePerson(int personId);
	public Person find(int personId);
	public List<Person> findAll();
}