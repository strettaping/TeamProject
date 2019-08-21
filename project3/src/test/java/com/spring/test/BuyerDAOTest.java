package com.spring.test;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.dao.BuyerDAO;
import com.spring.vo.BuyerVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class BuyerDAOTest {

	@Inject
	private BuyerDAO bdao;
	
	/*
	 * @Test 
	 * public void writeTest() throws Exception{ 
	 * BuyerVO bvo = new BuyerVO();
	 * bvo.setBuyID("BTester"); bvo.setBuyPw("1q2w3e4r!"); bvo.setBuyName("구매자테스터");
	 * bvo.setBuyPN("123-456-7890"); bvo.setBuyAdd1("서울시 종로구 관철동");
	 * bvo.setBuyAdd2("솔데스크 802호");
	 * 
	 * bdao.insertBuyer(bvo); }
	 */
	

}
