package com.techlabs.action;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.opensymphony.xwork2.Action;

public class HomeAction implements Action {

	private SimpleDateFormat time ;
	
	public HomeAction(){
		time= new SimpleDateFormat("dd-MM-yyyy hh-mm-ss");
	}

	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}

	public String getTime() {
		return time.format(new Date());
	}
}
