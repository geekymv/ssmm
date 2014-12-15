package com.gos.dao;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.gos.model.Dvd;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/beans.xml")
public class DvdDAOTest {

	private DvdDAO dvdDAO;
	@Resource
	public void setDvdDAO(DvdDAO dvdDAO) {
		this.dvdDAO = dvdDAO;
	}

	@Test
	public void test() {
		List<Dvd> dvds = dvdDAO.queryAll();
		
		for (Dvd dvd : dvds) {
			
			System.out.println(dvd);
		}
	}
	
	@Test
	public void testQuery() {
		
		Dvd dvd = dvdDAO.query(1);
		System.out.println(dvd);
	}

}

















