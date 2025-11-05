package com.tnsif.Spring_Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
  public static void main(String[] args) {
    ApplicationContext context = new ClassPathXmlApplicationContext("confg.xml");
    Mobile mob = context.getBean("mob",Mobile.class);
    mob.call();
    mob.data();
    
  }
}
