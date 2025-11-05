package com.tns.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MathsExam {

	public static void main(String[] args) {
		
		ApplicationContext con=new ClassPathXmlApplicationContext("beans.xml");
		
		//setter injection
		Student thamizh=con.getBean("gopi",Student.class);
		Student kalai=con.getBean("rex",Student.class);
		
		thamizh.showInfo();
		kalai.showInfo();
		
		//Constructor injection
		Student1 sk=con.getBean("vicky",Student1.class);
		Student1 hm=con.getBean("gaja",Student1.class);
		
		sk.showInfo();
		hm.showInfo();
		
	}
}
