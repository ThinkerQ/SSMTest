package com.pingan.groupinsure.base.web.controller;

import javax.servlet.ServletContext;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class EmployeesController {
	
	@RequestMapping("/employee")
    public String employee() {
        return "list";
    }
	
	@RequestMapping("/add")
	public void add(){
	}
}
