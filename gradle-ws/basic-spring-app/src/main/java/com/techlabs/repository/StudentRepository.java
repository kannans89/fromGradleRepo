package com.techlabs.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.techlabs.model.Student;

@Repository("studentRepo")
public class StudentRepository {
	//DAO
	
	public StudentRepository(){
		System.out.println("student repository");
	}
	
	public List<Student> getStudents(){
	List<Student> studList=new ArrayList<Student>();
	studList.add(new Student("Pratik", "Ratti"));
	studList.add(new Student("Sangam", "Kaware"));
	return studList;
	}
}
