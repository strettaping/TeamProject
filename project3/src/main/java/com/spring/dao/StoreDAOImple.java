package com.spring.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import com.spring.vo.StoreVO;

public class StoreDAOImple implements StoreDAO {
	@Inject
	SqlSession ss;

	@Override
	public List<StoreVO> read(String category) {
		// TODO Auto-generated method stub
		return ss.selectList("list", category);
	}

	@Override
	public List<StoreVO> list(String sellID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(StoreVO svo) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Integer sID) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Integer sID) {
		// TODO Auto-generated method stub

	}

}
