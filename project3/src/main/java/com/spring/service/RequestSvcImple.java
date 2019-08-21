package com.spring.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.spring.dao.RequestDAO;
import com.spring.vo.RequestVO;

@Service
public class RequestSvcImple implements RequestSvc {

	@Inject
	RequestDAO rdao;
	
	@Override
	public void write(RequestVO rvo) {
		rdao.insertRequest(rvo);
	}
	
	@Override
	public RequestVO read(int oId) {
		return rdao.selectOne(oId);
	}
	
	@Override
	public List<RequestVO> listAll(){
		return rdao.selectAll();
	}
	
	@Override
	public void modify(RequestVO rvo) {
		rdao.updateRequest(rvo);
	}
	
	@Override
	public void remove(int oId) {
		rdao.deleteRequest(oId);
	}
	
}
