package com.techlabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.dao.StudentDAO;
import com.techlabs.model.Student;
@Service("StudentService")
public class StudentService {
	@Autowired
	private StudentDAO studentDao;
	
	public StudentService() {
		System.out.println("Student Service");
	}
	
	public List<Student> get(){
		return studentDao.getStudents();
	}
}
