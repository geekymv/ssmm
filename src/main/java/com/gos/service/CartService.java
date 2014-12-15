package com.gos.service;

import java.util.List;

import com.gos.model.Cart;



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
}
