package com.techlabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.model.Student;
import com.techlabs.repository.StudentRepository;

@Service("StudentService")
public class StudentService {

	public StudentService() {
		System.out.println("Student Service");
	}
	
	@Autowired
	private StudentRepository studRepo;
	
	public List<Student> get(){
		return studRepo.getStudents();
	}
}
