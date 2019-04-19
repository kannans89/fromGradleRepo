package com.techlabs.action;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ModelDriven;
import com.techlabs.service.StudentService;

public class DeleteAction implements Action,ModelDriven<DeleteViewModel>{
	private DeleteViewModel model;
	private StudentService service;
	
	public DeleteAction() {
		service = new StudentService();
	}
	
	@Override
	public String execute() throws Exception {
		System.out.println("Delete id is: "+model.getId());
		service.deleteStudentService(model.getId());
		return "success";
	}

	@Override
	public DeleteViewModel getModel() {
		model=new DeleteViewModel();
		return model;
	}

}
