package com.coforge.springMvc.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.coforge.springMvc.model.Employee;

@Repository //mentions that the class provides the mechanism 
//for database CRUD operations on Objects 

@Qualifier("employeedao")
public class EmployeeDaoImpl implements EmployeeDao{
	
	

	@Autowired 
	JdbcTemplate jdbcTemplate;   
	    
		
		@Override
		public void Save(Employee employee) {
			// TODO Auto-generated method stub
			jdbcTemplate.update("INSERT INTO Emp99 (id, name," 
					+ " salary, designation) VALUES (?, ?, ?, ?)", employee.getId(),employee.getName(),employee.getSalary(),employee.getDesignation());
					
						System.out.println("Employee Added!!");
						
		}
		
		@Override
		public List<Employee> getEmployees() {
			// TODO Auto-generated method stub
			
			 return jdbcTemplate.query("select * from Emp99",new RowMapper<Employee>(){    
			        public Employee mapRow(ResultSet rs, int row) throws SQLException {    
			        	Employee e=new Employee();    
			            e.setId(rs.getInt(1));    
			            e.setName(rs.getString(2));    
			            e.setSalary(rs.getInt(3));    
			            e.setDesignation(rs.getString(4));    
			            return e;    
			        }    
			    });    
		} 
			
		
}
