package com.gos.dao;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gos.model.Cart;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/beans.xml")
public class CartDAOTest {

	private CartDAO cartDAO;
	@Resource
	public void setCartDAO(CartDAO cartDAO) {
		this.cartDAO = cartDAO;
	}
	
	@Test
	public void test() {
		Cart cart = cartDAO.query(1, 1);
		
		System.out.println(cart);
	}
	
	@Test
	public void testQueryMyCart() {
		
		List<Cart> carts = cartDAO.queryMyCart(1);
		
		for (Cart cart : carts) {
			System.out.println(cart);
		}
	}

}
