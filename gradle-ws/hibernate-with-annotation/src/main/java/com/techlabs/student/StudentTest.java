package com.techlabs.student;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class StudentTest {
	private static SessionFactory factory;
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");

		//factory = cfg.buildSessionFactory();
		factory = cfg.buildSessionFactory();
		StudentTest st= new StudentTest();
		//st.createTable();
		st.displayStudent();
		//st.updateStudent();
		//st.deleteStudent();
	}
	
	public void createTable(){
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		try{
			Student s1 = new Student();
			s1.setFirstName("pratik");
			s1.setLastName("Ratti");
			session.persist(s1);

			Student s2 = new Student();
			
			s2.setFirstName("Sangam");
			s2.setLastName("Kawre");
			session.persist(s2);
			
			transaction.commit();
			System.out.println("Saved Successfully");
		} catch (Exception ex) {
			ex.printStackTrace();
			transaction.rollback();
			System.out.println("Transactin RollBacked");
		} finally {
			session.close();
		}
		}
	
	public void displayStudent(){
		Session session=factory.openSession();
		//Transaction transaction=session.beginTransaction();
		Student student = (Student) session.get(Student.class, new Long(1));
		System.out.println(student.getFirstName()+" "+student.getLastName());
	//	transaction.commit();
		session.close();
	}
	
	public void updateStudent(){
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Student student = (Student) session.get(Student.class, new Long(2));
		student.setFirstName("Santosh");
		session.update(student);
		transaction.commit();
		session.close();
	}
	public void deleteStudent(){
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		Student student = (Student) session.get(Student.class, new Long(2));
		session.delete(student);
		transaction.commit();
		session.close();
	}
}

