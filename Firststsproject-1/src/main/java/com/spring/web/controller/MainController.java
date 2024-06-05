package com.spring.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {
@RequestMapping("/")
@ResponseBody()
public String home()
{
	System.out.println("this is home page");
	return "home";
}
	
	
}
