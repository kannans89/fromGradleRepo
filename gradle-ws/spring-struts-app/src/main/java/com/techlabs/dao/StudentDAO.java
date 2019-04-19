package com.techlabs.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.techlabs.model.Student;
@Repository("studentRepo")
public class StudentDAO {

	public StudentDAO(){
		System.out.println("student repository");
	}
	
	public List<Student> getStudents(){
	List<Student> studList=new ArrayList<Student>();
	studList.add(new Student("Pratik", "Ratti"));
	studList.add(new Student("Sangam", "Kaware"));
	studList.add(new Student("Santosh", "Somankar"));
	studList.add(new Student("Sandeep", "Gade"));
	studList.add(new Student("Pratibha", "Dodhi"));
	return studList;
	}
}
