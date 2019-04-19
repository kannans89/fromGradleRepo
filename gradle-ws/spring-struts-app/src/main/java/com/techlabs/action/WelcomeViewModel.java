package com.techlabs.action;

import java.util.List;

import com.techlabs.model.Student;

public class WelcomeViewModel {
	private List<Student> students;

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
}
