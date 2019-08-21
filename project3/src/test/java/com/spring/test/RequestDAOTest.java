package com.spring.test;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.dao.RequestDAO;
import com.spring.vo.RequestVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class RequestDAOTest {
	
	@Inject
	private RequestDAO rdao;
	/*
	@Test
	public void insertTest() {
		RequestVO rvo = new RequestVO();
		rvo.setMenu("피자");
		rvo.setPrice(9000);
		rvo.setQty(3);
		rvo.setOcode("abcd");
		rvo.setStatus("배송중");
		rvo.setSellId("jskim0648");
		rvo.setBuyId("doowon28");
			
		rdao.insertRequest(rvo);
		
	}
	*/
	
	@Test
	public void deleteTest() {
		
		rdao.deleteRequest(2);	
	}
	
	
}
