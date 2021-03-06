package com.spring.service;

import java.util.List;

import com.spring.vo.StoreVO;

public interface StoreSvc {
	public List<StoreVO> listCategory(String category);
	public List<StoreVO> listsNameAdd(String sName, String address);
	public void write(StoreVO svo);
	public void modify(Integer sID);
	public void remove(Integer sID);
}
