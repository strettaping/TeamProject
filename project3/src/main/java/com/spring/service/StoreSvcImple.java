package com.spring.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.spring.dao.StoreDAO;
import com.spring.vo.StoreVO;

@Service
public class StoreSvcImple implements StoreSvc{
	
	@Inject
	StoreDAO stdao;

	@Override
	public List<StoreVO> listCategory(String category) {
		// TODO Auto-generated method stub
		return stdao.listCategory(category);
	}

	@Override
	public List<StoreVO> listSellID(String sellID) {
		// TODO Auto-generated method stub
		return stdao.listSellID(sellID);
	}

	@Override
	public void write(StoreVO svo) {
		stdao.insert(svo);		
	}

	@Override
	public void modify(Integer sID) {
		stdao.update(sID);		
	}

	@Override
	public void remove(Integer sID) {
		stdao.delete(sID);		
	}

}
