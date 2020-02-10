package com.gx.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("hello")
public class HelloController {

	@RequestMapping("helloworld.action")
	@ResponseBody
	public String helloword() {
		return "hello world";
	}
	
	@RequestMapping("test1.action")
	public void test1() {
		System.out.println("this is test1");
	}
	
}
