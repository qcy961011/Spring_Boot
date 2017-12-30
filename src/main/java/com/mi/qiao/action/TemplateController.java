package com.mi.qiao.action;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mi.qiao.Service.UserService;
import com.mi.qiao.entity.User;

@Controller
@RequestMapping("/qiao")
public class TemplateController {

	@Autowired
	private UserService userService;

	@RequestMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("hello", "哈哈哈哈哈哈哈");
		return "hellohtml";
	}

	@RequestMapping("/userlist")
	public String userList(Model model) {
		List<User> list = new ArrayList<>();
		list = userService.selectAll();
		model.addAttribute("userlist", list);
		return "userlist";
	}
}
