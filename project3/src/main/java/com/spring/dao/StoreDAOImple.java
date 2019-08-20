package com.spring.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spring.vo.StoreVO;

@Repository
public class StoreDAOImple implements StoreDAO {
	
	@Inject
	SqlSession ss;

	@Override
	public List<StoreVO> listCategory(String category) {
		// TODO Auto-generated method stub
		return ss.selectList("selectByCategory", category);
	}

	@Override
	public List<StoreVO> listsPNum(String sPNumber) {
		// TODO Auto-generated method stub
		return ss.selectList("selectBysNameAdd", sPNumber);
	}

	@Override
	public void insert(StoreVO stvo) {
		ss.insert("insertBySellID", stvo);
	}

	@Override
	public void update(Integer sID) {
		ss.update("updateSeller", sID);

	}

	@Override
	public void delete(Integer sID) {
		ss.delete("deleteBySID", sID);

	}

}
