package com.gos.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gos.model.Cart;
import com.gos.model.User;
import com.gos.service.CartService;

@Controller
public class CartController {
	
	private CartService cartService;
	@Resource
	public void setCartService(CartService cartService) {
		this.cartService = cartService;
	}
	
	@RequestMapping("/add-cart")
	@ResponseBody
	public String addCart(Integer id, HttpSession session) {
	//	cartService.add(cart);
		System.out.println("id = " + id);
		
		User user = (User) session.getAttribute("user");
		if(user != null) {
			boolean res = cartService.add(user.getId(), id);
			if(res) {
				return "success";
			}
		}
		
		return "fail";
	}
	
	/**
	 * 我的购物车
	 * @return
	 */
	@RequestMapping("/mycart")
	public String myCart(Model model, HttpSession session){
		
		User user = (User) session.getAttribute("user");
		if(user != null) {
			List<Cart> carts = cartService.showMyCart(user.getId());
			model.addAttribute("carts", carts);
			return "mycart";			
		}
		
		return "redirect:login";
	}
	
}
