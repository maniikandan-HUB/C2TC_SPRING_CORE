package com.tnsif.springProjectOne;

import java.util.List;

public class Department {

	private String departmentName;
	private List<Student> studentList;
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public List<Student> getStudentList() {
		return studentList;
	}
	public void setStudentList(List<Student> studentList) {
		this.studentList = studentList;
		
		for(Student student : studentList) {
			student.setDepartment(this);
		}
	}
	
}
