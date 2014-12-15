package com.gos.service;

import java.util.List;

import com.gos.model.Cart;
import com.gos.model.User;



public interface CartService {
	
	/**
	 * 添加
	 * @param userId
	 * @param dvdId
	 * @return
	 */
	public boolean add(Integer userId, Integer dvdId);

	/**
	 * 我的购物车
	 * @return
	 */
	public List<Cart> showMyCart(Integer userId);
	
	
	/**
	 * 买单
	 * @param user
	 * @return
	 */
	public boolean pay(User user);
}
