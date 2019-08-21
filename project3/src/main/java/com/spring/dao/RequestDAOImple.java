package com.spring.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spring.vo.RequestVO;

@Repository
public class RequestDAOImple implements RequestDAO{
	
	@Inject
	SqlSession ss;

	
	
	@Override
	public RequestVO selectOne(int oId) {
		return ss.selectOne("selectOneRequest", oId);
	}
	
	@Override
	public List<RequestVO> selectAll(){
		return ss.selectList("selectRequestList");
	}
	
	@Override
	public void insertRequest(RequestVO rvo) {
		// TODO Auto-generated method stub
		ss.insert("insertRequest", rvo);
	}
	
	@Override
	public void updateRequest(RequestVO rvo) {
		ss.update("updateRequest", rvo);
	}
	
	@Override
	public void deleteRequest(int oId) {
		ss.delete("deleteRequest",oId);
		//deleteRequest 는  requestMapper.xml에서의 id = deleteRequest인것과 연관
	}
}
