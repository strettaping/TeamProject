package com.spring.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spring.vo.BuyerVO;

@Repository
public class BuyerDAOImple implements BuyerDAO{
	
	@Inject
	SqlSession ss;

	@Override
	public void insertBuyer(BuyerVO bvo) {
		ss.insert("insertBuyer", bvo);
		
	}

	@Override
	public BuyerVO selectOne(String buyerID) {
		
		return ss.selectOne("selectOneByBuyID", buyerID);
	}

	@Override
	public List<BuyerVO> selectAll() {
		// TODO Auto-generated method stub
		return ss.selectList("selectBuyerList");
	}

	@Override
	public void updateBuyer(BuyerVO bvo) {
		ss.update("updateByBuyId", bvo);
		
	}

	@Override
	public void deleteBuyer(String buyerID) {
		ss.delete("deleteByBuyID", buyerID);
		
	}
	
}
