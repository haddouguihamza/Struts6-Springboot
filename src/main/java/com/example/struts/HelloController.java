/**
 * 
 */
package com.example.struts;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * 
 */
@Controller
public class HelloController {

	@GetMapping("/hello")
	public String accessHelloPage(ModelAndView model, HttpServletRequest request, HttpServletResponse response) {
		return "redirect:/hello.action";
	}
}
