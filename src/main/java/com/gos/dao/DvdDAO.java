package com.gos.dao;

import java.util.List;

import com.gos.model.Dvd;

public interface DvdDAO {
	
	public List<Dvd> queryAll();
	
	/**
	 * 根据id查询
	 * @param id
	 * @return
	 */
	public Dvd query(Integer id);

}
