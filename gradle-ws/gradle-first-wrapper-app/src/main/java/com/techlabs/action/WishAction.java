package com.techlabs.action;

import com.opensymphony.xwork2.Action;

public class WishAction implements Action {
	
	private String yourName;
	private String messege;
	
	@Override
	public String execute() throws Exception {
		if(yourName!=null){
			messege="Hello "+yourName+"! Welcome back.";
			System.out.println("In execute() method");
		}
		return SUCCESS;
	}

	public String getYourName() {
		return yourName;
	}

	public void setYourName(String yourName) {
		this.yourName = yourName;
	}
	
	public String getMessege(){
		return messege;
	}

}
