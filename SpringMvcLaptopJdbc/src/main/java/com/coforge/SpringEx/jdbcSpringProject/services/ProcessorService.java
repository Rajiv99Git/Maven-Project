package com.coforge.SpringEx.jdbcSpringProject.services;

import java.util.List;

import com.coforge.springMvc.model.Laptop;
import com.coforge.springMvc.model.Processor;





public interface ProcessorService {
	
	public void Save(Processor processor);
	public void editProcessor(Processor processor,int id);
	public void deleteProcessor(int id);
	public Processor find(int id);
	public List<Processor> findAll();
	public void Save(Laptop laptop);
	public List<Laptop> findAllLaptop();
	public void editLaptop(Laptop laptop,int id);
	public Laptop findLaptop(int id);
	public void deleteLaptop(int serial_no);
}
