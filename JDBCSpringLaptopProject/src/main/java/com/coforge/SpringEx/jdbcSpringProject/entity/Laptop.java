package com.coforge.SpringEx.jdbcSpringProject.entity;

import org.springframework.beans.factory.annotation.Autowired;

public class Laptop {
	
	private int serial_No;
	private Processor processor;
	private String graphic_Card;
	private int Ram;
	private String Company;
	private double Price;
	
	
	public Laptop() {
		super();
	}
	
	

	public Laptop(int serial_No, Processor processor, String graphic_Card, int i, String company, double d) {
		super();
		this.serial_No = serial_No;
		this.processor = processor;
		this.graphic_Card = graphic_Card;
		Ram = i;
		Company = company;
		Price = d;
	}



	public int getSerial_No() {
		return serial_No;
	}
	public void setSerial_No(int serial_No) {
		this.serial_No = serial_No;
	}
	
	public String getGraphic_Card() {
		return graphic_Card;
	}
	public void setGraphic_Card(String graphic_Card) {
		this.graphic_Card = graphic_Card;
	}
	public int getRam() {
		return Ram;
	}
	public void setRam(int ram) {
		Ram = ram;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}



	public Processor getProcessor() {
		return processor;
	}



	public void setProcessor(Processor processor) {
		this.processor = processor;
	}

	
	
	

}
