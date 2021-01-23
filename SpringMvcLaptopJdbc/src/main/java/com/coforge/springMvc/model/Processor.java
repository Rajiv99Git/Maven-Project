package com.coforge.springMvc.model;

public class Processor {
	
	private int id;
	private Laptop laptop;
	private String generation;
	private String company;
	private String chipset;
	public Processor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Processor(int id, Laptop laptop, String generation, String company, String chipset) {
		super();
		this.id = id;
		this.laptop = laptop;
		this.generation = generation;
		this.company = company;
		this.chipset = chipset;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}

	public String getGeneration() {
		return generation;
	}
	public void setGeneration(String generation) {
		this.generation = generation;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getChipset() {
		return chipset;
	}
	public void setChipset(String chipset) {
		this.chipset = chipset;
	}
	@Override
	public String toString() {
		return "Processor [id=" + id + ", generation=" + generation + ", company=" + company + ", chipset=" + chipset
				+ "]";
	}
	
}


