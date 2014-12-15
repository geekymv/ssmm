package com.gos.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gos.dao.DvdDAO;
import com.gos.model.Dvd;
import com.gos.service.DvdService;

@Service("dvdService")
public class DvdServiceImpl implements DvdService {

	private DvdDAO dvdDAO;
	@Resource
	public void setDvdDAO(DvdDAO dvdDAO) {
		this.dvdDAO = dvdDAO;
	}
	
	public List<Dvd> queryAll() {
		return dvdDAO.queryAll();
	}
	
}
