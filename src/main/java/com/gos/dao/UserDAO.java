package com.gos.dao;

import org.apache.ibatis.annotations.Param;

import com.gos.model.User;

public interface UserDAO {
	
	public User query(@Param("loginId") String loginId, @Param("pwd") String pwd);
	
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	public User queryById(Integer id);

}
