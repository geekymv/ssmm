package com.gos.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gos.dao.UserDAO;
import com.gos.model.User;
import com.gos.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	private UserDAO userDAO;
	@Resource
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	
	public User login(String loginId, String pwd) {

		return userDAO.query(loginId, pwd);
	}

}
