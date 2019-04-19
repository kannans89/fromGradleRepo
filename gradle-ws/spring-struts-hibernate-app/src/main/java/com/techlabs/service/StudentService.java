package com.techlabs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techlabs.dao.StudentDAO;
import com.techlabs.entity.Student;
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
	
	public Student getStudent(int id){
		return studentDao.getStudentDao(id);
	}
	
	public void updateStudent(Student student){
		studentDao.updateStudentDao(student);
	}
	
	public void deleteStudentService(int studId){
		studentDao.deleteStudentDao(studId);
	}
}
