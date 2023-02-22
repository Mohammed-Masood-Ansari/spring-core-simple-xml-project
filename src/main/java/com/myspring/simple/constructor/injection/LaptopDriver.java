package com.myspring.simple.constructor.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopDriver {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("myspring.xml");
		Laptop laptop=(Laptop) applicationContext.getBean("constructorInjection");
		
		System.out.println(laptop);
	}
}
