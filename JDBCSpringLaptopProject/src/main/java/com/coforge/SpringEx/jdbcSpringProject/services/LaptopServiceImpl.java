package com.coforge.SpringEx.jdbcSpringProject.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.coforge.SpringEx.jdbcSpringProject.dao.LaptopDao;
import com.coforge.SpringEx.jdbcSpringProject.entity.Laptop;







@Service("laptopService")
public class LaptopServiceImpl implements LaptopService {

	@Autowired
	LaptopDao laptopDao;
	@Override
	public void addLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		laptopDao.addLaptop(laptop);
	}

	@Override
	public void editLaptop(Laptop laptop, int serial_No) {
		// TODO Auto-generated method stub
		laptopDao.editLaptop(laptop, serial_No);
	}

	@Override
	public void deleteLaptop(int serial_No) {
		// TODO Auto-generated method stub
		laptopDao.deleteLaptop(serial_No);
	}

	@Override
	public Laptop find(int serial_No) {
		// TODO Auto-generated method stub
		return laptopDao.find(serial_No);
	}

	@Override
	public List<Laptop> findAll() {
		// TODO Auto-generated method stub
		return laptopDao.findAll();
	}

}
