package com.techlabs.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.service.StudentService;

public class WelcomeAction implements Action,ModelDriven<WelcomeViewModel> {
	private WelcomeViewModel model;
	@Autowired
	private StudentService studentService;
	
	public WelcomeAction() {
		System.out.println("Welcome Action");
	}
	
	@Override
	public String execute() throws Exception {
		model.setStudents(studentService.get());
		return "success";
	}

	@Override
	public WelcomeViewModel getModel() {
		model= new WelcomeViewModel();
		return model;
	}

}
