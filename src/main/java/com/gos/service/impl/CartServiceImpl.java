package com.gos.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gos.dao.CartDAO;
import com.gos.dao.DvdDAO;
import com.gos.dao.UserDAO;
import com.gos.model.Cart;
import com.gos.model.Dvd;
import com.gos.model.User;
import com.gos.service.CartService;


@Service("cartService")
public class CartServiceImpl implements CartService {

	private CartDAO cartDAO;
	private UserDAO userDAO;
	private DvdDAO dvdDAO;
	@Resource
	public void setCartDAO(CartDAO cartDAO) {
		this.cartDAO = cartDAO;
	}
	@Resource
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}
	@Resource
	public void setDvdDAO(DvdDAO dvdDAO) {
		this.dvdDAO = dvdDAO;
	}
	
	
	public boolean add(Integer userId, Integer dvdId) {
		
		Dvd dvd = dvdDAO.query(dvdId);
		
		// 判断购物车中是否已经存在该商品
		Cart c = cartDAO.query(userId, dvdId);
		if(c == null) { // 不存在
			User user = userDAO.queryById(userId);

			Cart cart = new Cart(user, dvd, 1, dvd.getPrice(), 1);
			int res = cartDAO.add(cart);
			if(res == 1) {
				return true;
			}
			
		}else { // 存在
			// 更新商品个数
			c.setBuynum(c.getBuynum()+1);
			c.setItemprice(c.getItemprice() + dvd.getPrice());
			int res = cartDAO.update(c);
			if(res == 1) {
				return true;
			}
		}
		
		return false;
	}
	
	
	public List<Cart> showMyCart(Integer userId) {
		
		return cartDAO.queryMyCart(userId);
	}
	
	
	public boolean pay(User user) {
		
		List<Cart> carts = cartDAO.queryMyCart(user.getId());
		
		boolean falg = true;
		for (Cart cart : carts) {
			cart.setStatus(-1); // 表示删除
			int res = cartDAO.update(cart);
			if(res != 1) {
				falg = false;
			}
		}
		
		return falg;
	}

}























