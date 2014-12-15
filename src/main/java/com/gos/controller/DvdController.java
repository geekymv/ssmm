package com.gos.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gos.model.Dvd;
import com.gos.service.DvdService;

@Controller
public class DvdController {
	
	private DvdService dvdService;
	@Resource
	public void setDvdService(DvdService dvdService) {
		this.dvdService = dvdService;
	}
	
	/**
	 * 商品列表
	 * @param model
	 * @return
	 */
	@RequestMapping("/list-dvd")
	public String listDvd(Model model) {
		
		List<Dvd> dvds = dvdService.queryAll();
		model.addAttribute("dvds", dvds);
		
		return "index";
	}
}
