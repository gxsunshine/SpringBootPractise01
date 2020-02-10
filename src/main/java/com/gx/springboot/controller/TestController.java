package com.gx.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// RestController 相当于 Controller + ResponseBody
@RestController
//@Controller
//@ResponseBody
@RequestMapping("test")
public class TestController {

	@RequestMapping("test1.action")
	public String test1() {
		return "this is test02";
	}

}
