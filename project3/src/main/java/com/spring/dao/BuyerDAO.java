package com.spring.dao;

import java.util.List;

import com.spring.vo.BuyerVO;

public interface BuyerDAO {
	public void insertBuyer(BuyerVO bvo);
	public BuyerVO selectOne(String buyerID);
	public List<BuyerVO> selectAll();
	public void updateBuyer(BuyerVO bvo);
	public void deleteBuyer(String buyerID);
}
