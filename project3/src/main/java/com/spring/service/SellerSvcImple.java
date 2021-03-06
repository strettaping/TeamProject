package com.spring.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.spring.dao.SellerDAO;
import com.spring.vo.SellerVO;

@Service
public class SellerSvcImple implements SellerSvc {
	
	@Inject
	SellerDAO sdao;
	
	public SellerSvcImple() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void write(SellerVO svo) {
		System.out.println("입력시작");
		sdao.insertSeller(svo);

	}

	@Override
	public SellerVO read(String sellID) {
		return sdao.selectOne(sellID);
	}

	@Override
	public List<SellerVO> listAll() {
		return sdao.selectAll();
	}

	@Override
	public void modify(SellerVO svo) {
		sdao.updateSeller(svo);
	}

	@Override
	public void remove(String sellID) {
		sdao.deleteSeller(sellID);
	}

}
