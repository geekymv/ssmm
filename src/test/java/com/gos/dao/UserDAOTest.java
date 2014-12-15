package com.gos.dao;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gos.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/beans.xml")
public class UserDAOTest {
	
	@Resource
	private UserDAO userDAO;
	
	@Test
	public void test() {
		
		User user = userDAO.query("yingmi", "123");
		
		System.out.println(user);
	}

}
