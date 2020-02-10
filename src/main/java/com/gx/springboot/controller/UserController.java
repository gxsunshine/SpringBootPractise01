package com.gx.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gx.springboot.model.User;

@RestController
@RequestMapping("user")
public class UserController {

	@RequestMapping("show.action")
	public User show() {
		User user = new User();
		user.setName("gx");
		user.setPwd("123456");
		return user;
	}
}
