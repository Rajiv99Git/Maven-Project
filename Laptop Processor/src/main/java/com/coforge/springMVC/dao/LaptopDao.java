package com.coforge.springMVC.dao;

import java.util.List;

import com.coforge.springMVC.model.Laptop;




public interface LaptopDao {
	
public void addLaptop(Laptop laptop);	
	
	public List <Laptop> findAll();
	
	public void deleteLaptop(int serialNo);
	
	public void updateLaptop(Laptop laptop);
	
	public Laptop getLapById(int serialNo);    
	 
}
