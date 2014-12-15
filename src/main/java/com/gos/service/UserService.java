package com.gos.service;

import com.gos.model.User;

public interface UserService {
	
	/**
	 * 用户登录
	 * @param loginId
	 * @param pwd
	 * @return
	 */
	public User login(String loginId, String pwd);

}
