package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collection/collectionconfig.xml");
	Employe emp1=(Employe)context.getBean("emp1");
	
	System.out.println(emp1.getName());
	System.out.println(emp1.getPhones());
	System.out.println(emp1.getAddress());
	System.out.println(emp1.getCourses());
	}

}
