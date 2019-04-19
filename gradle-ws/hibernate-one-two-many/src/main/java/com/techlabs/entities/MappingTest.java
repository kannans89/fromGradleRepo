package com.techlabs.entities;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MappingTest {

	public static void main(String args[]){
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		/*
		Department dept= new Department("Sales");
		dept.getEmps().add(new Employee("Pratik", dept));
		dept.getEmps().add(new Employee("Sangem", dept));
		dept.getEmps().add(new Employee("Santosh", dept));
		session.save(dept);*/
		
		Department dept2= new Department("Marketing");
	    Set<Employee> emps = new HashSet<Employee>();
	    emps.add(new Employee("Vipul", dept2));
	    emps.add(new Employee("Karan", dept2));
	    dept2.setEmps(emps);
		
		//dept2.getEmps().add(new Employee("Vipul", dept2));
		//dept2.getEmps().add(new Employee("Karan", dept2));
		//dept2.getEmps().add(new Employee("Sandeep", dept2));
		session.save(dept2);
		
		transaction.commit();
		session.close();
	}
}
