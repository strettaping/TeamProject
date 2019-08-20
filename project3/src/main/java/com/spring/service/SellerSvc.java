package com.spring.service;

import java.util.List;

import com.spring.vo.SellerVO;

public interface SellerSvc {
	public void write(SellerVO svo);
	public SellerVO read(String sellID);
	public List<SellerVO> listAll();
	public void modify(SellerVO svo);
	public void remove(String sellID);
}
