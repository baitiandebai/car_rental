package com.effort.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.effort.service.Car;

public class Test {
//
//	@Autowired
//	private Car car;
	
	public static void main(String[] args){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Car car = (Car) context.getBean("car");
		
		car.printf();
	}
}
