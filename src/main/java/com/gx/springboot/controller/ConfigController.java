package com.gx.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gx.springboot.model.Config;

@RestController
@RequestMapping("config")
public class ConfigController {
	
	// 使用容器自动填充的方式，如果对象属性有初始值，初始值不会为空
	@Autowired
	Config config;
	
	@RequestMapping("show.action")
	public Config show() {
		// 只能如果是使用new的方式创建对象则是空的
//		Config config2  = new Config();
//		System.out.println(config2);
		return config;
	}
}
