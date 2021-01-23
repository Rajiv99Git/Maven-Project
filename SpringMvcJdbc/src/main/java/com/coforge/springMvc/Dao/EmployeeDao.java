package com.coforge.springMvc.Dao;

import java.util.List;

import com.coforge.springMvc.model.Employee;

public interface EmployeeDao {

public void Save(Employee employee);	
	
	public List <Employee> getEmployees();
	
	
}
