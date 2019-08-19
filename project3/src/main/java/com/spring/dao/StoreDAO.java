package com.spring.dao;

import java.util.List;

import com.spring.vo.StoreVO;

public interface StoreDAO {
	public List<StoreVO> read(String category);
	public List<StoreVO> list(String sellID);
	public void insert(StoreVO svo);
	public void update(Integer sID);
	public void delete(Integer sID);
}
