package com.mi.qiao.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/action")
public class MySpringMVCConfig {

	@RequestMapping("/register")
	public String register() {
		return "login/register";
	}
	
	
}
