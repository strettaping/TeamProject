package com.spring.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.spring.dao.BuyerDAO;
import com.spring.vo.BuyerVO;

@Service
public class BuyerSvcImple implements BuyerSvc{
	@Inject
	BuyerDAO bdao;

	@Override
	public void write(BuyerVO bvo) {
		bdao.insertBuyer(bvo);
		
	}

	@Override
	public BuyerVO read(String BuyerID) {		
		return bdao.selectOne(BuyerID);
	}

	@Override
	public List<BuyerVO> listAll() {
		return bdao.selectAll();
	}

	@Override
	public void modify(BuyerVO bvo) {
		bdao.updateBuyer(bvo);
	}

	@Override
	public void remove(String buyerID) {
		bdao.deleteBuyer(buyerID);
		
	}

	
	
	
}
