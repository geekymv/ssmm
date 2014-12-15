package com.gos.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.gos.model.User;
import com.gos.service.UserService;

@Controller
public class UserController {

	private UserService userService;
	@Resource
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	/**
	 * 跳转到用户登录页面
	 * @param user
	 * @return
	 */
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String login(User user){
		
		return "login";
	}
	
	/**
	 * 登录验证
	 * @param user
	 * @param model
	 * @param session
	 * @return
	 */
	@RequestMapping(value="/login", method=RequestMethod.POST)
	public String login(User user, HttpSession session){
		
		user = userService.login(user.getLoginId(), user.getPwd());
		
		if(user != null) {
			session.setAttribute("user", user);
			return "redirect:list-dvd";
		}
		
		return "login";
	}
	
	
	
	
}
