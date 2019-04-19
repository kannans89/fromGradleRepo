package controller;

import com.opensymphony.xwork2.Action;

public class HomeController implements Action {
	
	private String message;

	@Override
	public String execute() throws Exception {
		
		message = "HelloWorld";
		return SUCCESS;
	}

	public String getMessage(){
		return this.message;
	}
}
