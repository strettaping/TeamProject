package com.spring.service;

import java.util.List;

import com.spring.vo.BuyerVO;

public interface BuyerSvc {
	public void write(BuyerVO bvo);
	public BuyerVO read(String buyerID);
	public List<BuyerVO> listAll();
	public void modify(BuyerVO bvo);
	public void remove(String buyerID);
}
