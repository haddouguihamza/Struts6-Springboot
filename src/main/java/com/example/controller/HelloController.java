package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import com.example.action.HelloAction;

@Controller
public class HelloController {

	/*
	 * @Autowired private HelloAction helloAction;
	 * 
	 * public HelloController(HelloAction action) { this.helloAction = action; }
	 */

	@GetMapping("/view")
	public String helloStruts() {
		System.out.println("controller HelloController called sucessfully");

		//this.helloAction.execute();

		return "forward:/helloStruts";
	}
}