package com.coforge.SpringEx.jdbcSpringProject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.springMvc.Dao.ProcessorDao;
import com.coforge.springMvc.model.Laptop;
import com.coforge.springMvc.model.Processor;


@Service("ProcessorService")
public class ProcessorServiceImpl implements ProcessorService {

	@Autowired
	ProcessorDao processorDao;
	

	
	
	@Override
	public void Save(Processor processor) {
		// TODO Auto-generated method stub
		processorDao.Save(processor);
	}

	@Override
	public void editProcessor(Processor processor, int id) {
		// TODO Auto-generated method stub
		processorDao.editProcessor(processor,id);
	}

	@Override
	public void deleteProcessor(int id) {
		// TODO Auto-generated method stub
		processorDao.deleteProcessor(id);
	}

	@Override
	public Processor find(int id) {
		// TODO Auto-generated method stub
		return processorDao.find(id);
	}

	@Override
	public List<Processor> findAll() {
		// TODO Auto-generated method stub
		return processorDao.findAll();
	}

	@Override
	public void Save(Laptop laptop) {
		// TODO Auto-generated method stub
		processorDao.Save(laptop);
	}

	@Override
	public List<Laptop> findAllLaptop() {
		// TODO Auto-generated method stub
		return processorDao.findAllLaptop();
	}

	@Override
	public void editLaptop(Laptop laptop, int id) {
		// TODO Auto-generated method stub
		processorDao.editLaptop(laptop,id);
	}

	@Override
	public Laptop findLaptop(int id) {
		// TODO Auto-generated method stub
		return processorDao.findLaptop(id);
	}

	@Override
	public void deleteLaptop(int serial_no) {
		// TODO Auto-generated method stub
		
	}

}
