package com.mi.qiao.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mi.qiao.Service.UserService;
import com.mi.qiao.Service.Impl.UserServiceImpl;
import com.mi.qiao.entity.User;

@RestController
public class AutoColl {

	@Autowired
	private UserService userService;

	@RequestMapping("/user/{id}")
	public String getUser(@PathVariable("id") int id) {
		return userService.selectByPrimaryKey(id).toString();
	}
	
}
