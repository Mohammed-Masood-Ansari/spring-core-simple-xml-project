package com.myspring.simple;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentDriver {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring.xml");
		
		Student student=(Student) applicationContext.getBean("mySpring");
		
		student.getStudent();
	}
}
