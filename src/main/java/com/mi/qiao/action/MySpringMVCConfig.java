package com.mi.qiao.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mi.qiao.Service.UserService;
import com.mi.qiao.entity.User;

@Controller
@RequestMapping("/action")
public class MySpringMVCConfig {

	@Autowired
	private UserService userServic;
	
	@RequestMapping("/register")
	public String register() {
		return "login/register";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "login/login";
	}
	
	@RequestMapping("/userlist")
	public String userList(Model model) {
		List<User> list = new ArrayList<>();
		list = userServic.selectAll();
		model.addAttribute("userlist", list);
		return "userlist";
	}
}
