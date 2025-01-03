package com.example.struts.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.springframework.stereotype.Controller;

@Controller
@Namespace("/")
public class HelloAction extends ActionSupport {
    private String message;

    @Action(value = "hello", results = { @Result(name = "success", location = "/views/hello.jsp") })
    public String get() {
        message = "Hello from Struts Action!";
        return SUCCESS;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}