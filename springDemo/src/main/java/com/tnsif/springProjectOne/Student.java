package com.tnsif.springProjectOne;

public class Student {
	
	private int id;
	private String name;
	private Department department;
	private String city;
	private int age;
	private long contactNumber;
	private String emailId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public String toString() {
		
		return "Student \n[ id = "+ id +" \n Name = "+ name +"\n Department = "+ department +"\n City = "+ city +"\n Age = "+ age +"\n Contact Number = "+ contactNumber +"\n Mail Id = "+ emailId + " ]"; 
	}

}
