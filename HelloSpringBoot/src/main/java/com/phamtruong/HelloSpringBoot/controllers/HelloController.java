package com.phamtruong.HelloSpringBoot.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller //Bảo rằng đây là 1 lớp controller

public class HelloController {

	@RequestMapping("/hello")
	public String Hello(ModelMap m) {
		//Gói dữ liệu vào biến m, để đưa sang view hiển thị
		m.addAttribute("tb", "Dữ liệu thông báo xin chào!");
		
		return "HelloDev";
	}
	
}