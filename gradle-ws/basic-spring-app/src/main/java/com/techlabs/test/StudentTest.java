package com.techlabs.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.techlabs.service.StudentService;

public class StudentTest {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		StudentService s1 = appContext.getBean("StudentService",
				StudentService.class);
		System.out.println(s1.get().size());
		System.out.println(s1.hashCode());

		StudentService s2 = appContext.getBean("StudentService",
				StudentService.class);
		System.out.println(s2.get().size());
		System.out.println(s2.hashCode());
	}
}
