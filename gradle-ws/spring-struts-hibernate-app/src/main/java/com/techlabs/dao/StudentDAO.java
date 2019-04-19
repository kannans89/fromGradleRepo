package com.techlabs.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.techlabs.entity.Student;
@Repository("studentRepo")
public class StudentDAO {
	@Autowired
	private SessionFactory factory;
	private Session session;
	private Transaction transaction;
	
	public StudentDAO(){
		System.out.println("student repository");
	}
	
	/*public List<Student> getStudents(){
	List<Student> studList=new ArrayList<Student>();
	studList.add(new Student(1,"Pratik", "Ratti"));
	studList.add(new Student(2,"Sangam", "Kaware"));
	studList.add(new Student(3,"Santosh", "Somankar"));
	studList.add(new Student(4,"Sandeep", "Gade"));
	studList.add(new Student(5,"Pratibha", "Dodhi"));
	return studList;
	}*/
	
	public List<Student> getStudents(){
		session=factory.openSession();
		Query query = session.createQuery("from Student");
        List<Student> studList = query.list();
        for(Student s:studList){
        	System.out.println(s.getId()+" "+s.getFirstName()+" "+s.getLastName());
        }
		return studList;
		
	}
	
	public void insert(){
		session=factory.openSession();
		transaction=session.beginTransaction();
		Student s=new Student(1,"pratik","ratti");
		session.save(s);
		transaction.commit();
	}
	
	public Student getStudentDao(int id){
		session=factory.openSession();
		Student stud=(Student) session.get(Student.class, id);
		System.out.println(stud.getFirstName());
		return stud;
	}
	
	public void updateStudentDao(Student student){
		System.out.println("Student firstname "+student.getFirstName());
		session=factory.openSession();
		transaction=session.beginTransaction();
		Student stud=(Student) session.get(Student.class, student.getId());
		stud.setFirstName(student.getFirstName());
		stud.setLastName(student.getLastName());
		session.update(stud);
		transaction.commit();
	}
	
	public void deleteStudentDao(int studId){
		session=factory.openSession();
		transaction=session.beginTransaction();
		Student stud= (Student) session.get(Student.class, studId);
		session.delete(stud);
		transaction.commit();
	}
}
