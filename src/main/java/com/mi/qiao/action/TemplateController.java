package com.mi.qiao.action;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TemplateController {

	@RequestMapping("/hello")
	public String hello(Model model) {
		model.addAttribute("hello", "哈哈哈哈哈哈哈");
		return "hellohtml";
	}
}
