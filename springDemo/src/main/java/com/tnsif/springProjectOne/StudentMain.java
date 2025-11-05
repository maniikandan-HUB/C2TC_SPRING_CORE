package com.tnsif.springProjectOne;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("student.xml");
		College college = context.getBean("college",College.class);
		
		college.printCollegeDetails();
	}

}
