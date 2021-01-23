package com.coforge.SpringEx.SpringJDBCProject.entity;

public class Person {
	
	private int personId;
	private String fname;
	private String lname;
	private int age;
	public Person() {
		// TODO Auto-generated constructor stub
	}
	public Person(int personId, String fname, String lname, int age) {
		super();
		this.personId = personId;
		this.fname = fname;
		this.lname = lname;
		this.age = age;
	}
	public int getPersonId() {
		return personId;
	}
	public void setPersonId(int personId) {
		this.personId = personId;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [personId=" + personId + ", fname=" + fname + ", lname=" + lname + ", age=" + age + "]";
	}

}