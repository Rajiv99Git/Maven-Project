package com.coforge.SpringEx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.SpringEx.SpringJDBCProject.entity.Person;
import com.coforge.SpringEx.dao.PersonDao;

@Service("personService")
public class PersonServiceImpl implements PersonService {

	
	@Autowired
	PersonDao personDao;
	
	
	@Override
	public void addPerson(Person person) {
		// TODO Auto-generated method stub
		personDao.addPerson(person);
	}

	@Override
	public void editPerson(Person person, int personID) {
		// TODO Auto-generated method stub
		personDao.editPerson(person, personID);
	}

	@Override
	public void deletePerson(int personId) {
		// TODO Auto-generated method stub
		personDao.deletePerson(personId);
	}

	@Override
	public Person find(int personId) {
		// TODO Auto-generated method stub
		return personDao.find(personId);
	}

	@Override
	public List<Person> findAll() {
		// TODO Auto-generated method stub
		return personDao.findAll();
	}

}
