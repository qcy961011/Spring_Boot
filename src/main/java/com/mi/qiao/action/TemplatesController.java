package com.mi.qiao.action;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mi.qiao.Service.UserService;
import com.mi.qiao.entity.User;


/**
 * 
 * 
 * @author qiao
 * 这个类没有实际的作用，就是看看而已，因为MVC的对应配置文件已被删除，现在只能使用模板功能
 */
@RestController
@RequestMapping("/action")
public class TemplatesController {
//	// 从 application.properties 中读取配置，如取不到application.properties定义的值，则取默认值为Hello
//	@Value("${application.hello:Hello Shanhy}")
//	private String hello;
//
//	@Autowired
//	private UserService userservice;
//
//	/**
//	 * 默认页<br/>
//	 * @RequestMapping("/") 和 @RequestMapping 是有区别的 如果不写参数，则为全局默认页。
//	 * 如果加了参数“/”，则只认为是根页面。
//	 */
//	@RequestMapping(value = { "/", "/index" })
//	public String index(Map<String, Object> model) {
//		// 直接返回字符串，框架默认会去 spring.view.prefix 目录下的 （index拼接spring.view.suffix）页面
//		// 本例为 /WEB-INF/jsp/index.jsp
//		model.put("time", new Date());
//		model.put("user", userservice.selectByPrimaryKey(4));
//		return "index";
//	}
//
//	/**
//	 * 响应到JSP页面page1
//	 */
//	@RequestMapping("/userlist")
//	public ModelAndView page1() {
//		// 页面位置 /page/page1.jsp
//		// page/page1:页面路径地址/页面名称
//		ModelAndView mav = new ModelAndView("page/userlist");
//		List<User> userArr = userservice.selectAll();
//		mav.addObject("content", hello);
//		mav.addObject("userlist", userArr);
//		return mav;
//	}
//
//	/**
//	 * 响应到JSP页面page1（可以直接使用Model封装内容，直接返回页面字符串）
//	 */
//	@RequestMapping("/alluser")
//	public String page2(Model model) {
//		// 页面位置 /page/userlist.jsp
//		List<User> userArr = userservice.selectAll();
//		model.addAttribute("content", hello + "（第二种）");
//		model.addAttribute("userlist", userArr);
//		return "page/userlist";
//	}
}
