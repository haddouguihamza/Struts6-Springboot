package com.example.action;

import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private String message = "display hello struts based action";

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the serialversionuid
	 */
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String execute() {
		this.message = "view model is defined";
		return SUCCESS;
	}

	public String displayResult() {
		return "serial version is: " + getSerialversionuid() + " while message value is: " + getMessage();
	}
}