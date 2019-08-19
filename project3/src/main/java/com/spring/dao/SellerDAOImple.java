package com.spring.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spring.vo.SellerVO;

@Repository
public class SellerDAOImple implements SellerDAO{
	
	@Inject
	SqlSession ss;
	
	@Override
	public void insertSeller(SellerVO svo) {
		ss.insert("insertSeller", svo);
		
	}

	@Override
	public SellerVO selectOne(String sellID) {
		return ss.selectOne("selectOneSeller", sellID);
	}

	@Override
	public List<SellerVO> selectAll() {
		return ss.selectList("selectSellerList");
	}

	@Override
	public void updateSeller(SellerVO svo) {
		ss.update("updateSeller", svo);
	}

	@Override
	public void deleteSeller(String sellID) {
		ss.delete("deleteSeller", sellID);
		
	}

}
