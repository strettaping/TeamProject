package com.spring.dao;

import java.util.List;

import com.spring.vo.RequestVO;

public interface RequestDAO {

	public void insertRequest(RequestVO rvo);
	public RequestVO selectOne(int oId);
	public List<RequestVO> selectAll();
	public void updateRequest(RequestVO rvo);
	public void deleteRequest(int oId);

}
