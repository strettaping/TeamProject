package com.spring.dao;

import java.util.List;

import com.spring.vo.SellerVO;

public interface SellerDAO {
	public void insertSeller(SellerVO svo);
	public SellerVO selectOne(String sellID);
	public List<SellerVO> selectAll();
	public void updateSeller(SellerVO svo);
	public void deleteSeller(String sellID);
}
