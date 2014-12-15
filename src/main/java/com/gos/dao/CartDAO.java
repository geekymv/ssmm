package com.gos.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gos.model.Cart;

public interface CartDAO {
	/**
	 * 添加商品到购物车
	 * @param cart
	 * @return
	 */
	public int add(Cart cart);
	
	/**
	 * 根据用户id和商品id判断该商品是否在购物车中且未被删除status=1
	 * @param userId
	 * @param dvdId
	 * @return
	 */
	public Cart query(@Param("userId") Integer userId, @Param("dvdId")Integer dvdId);
	
	/**
	 * 更新商品个数
	 * @param buynum
	 * @param id cartid
	 * @return
	 */
	public int update(Cart cart);
	
	/**
	 * 我的购物车
	 * @return
	 */
	public List<Cart> queryMyCart(Integer userId);
}
