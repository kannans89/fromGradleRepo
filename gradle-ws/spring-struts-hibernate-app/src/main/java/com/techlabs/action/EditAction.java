package com.techlabs.action;

import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.entity.Student;
import com.techlabs.service.StudentService;

public class EditAction implements Action, ModelDriven<EditViewModel> {

	private EditViewModel model;
	@Autowired
	private StudentService studentService;
	
	@Override
	public String execute() throws Exception {
		if (!model.isPostBack()) {
			model.setStudent(studentService.getStudent(model.getId()));
			return "firstTime";
		} else {
			studentService.updateStudent(model.getStudent());
			return "success";
		}
	}

	@Override
	public EditViewModel getModel() {
		model = new EditViewModel();
		return model;
	}

}
