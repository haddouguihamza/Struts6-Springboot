package com.example.struts.actions;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.springframework.stereotype.Controller;
import org.apache.struts2.convention.annotation.Result;

@Controller
@Namespace("/")
public class HelloAction {
	private String message;

	@Action(value = "hello", results = { @Result(name = "success", location = "/WEB-INF/views/hello.jsp") })
	public String execute() {
		message = "Hello from Struts Action!";
		return "success";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
