package com.tnsif.springProjectOne;

import java.util.List;

public class College {

	private String collegeName;
	private List<Department> departmentList;
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public List<Department> getDepartmentList() {
		return departmentList;
	}
	public void setDepartmentList(List<Department> departmentList) {
		this.departmentList = departmentList;
	}
	
	public void printCollegeDetails() {
		System.out.println("College Name:" + collegeName);
		
		for(Department department : departmentList) {
			System.out.println("Department Name :"+ department.getDepartmentName());
			
			for(Student student: department.getStudentList()) {
				System.out.println(student);
			}
		}
	}
	
}
