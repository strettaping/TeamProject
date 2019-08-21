package com.spring.service;

import java.util.List;

import com.spring.vo.RequestVO;

public interface RequestSvc {

	public void write(RequestVO rvo);
	public RequestVO read(int oId);
	public List<RequestVO> listAll();
	public void modify(RequestVO rvo);
	public void remove(int oId);
	

}
