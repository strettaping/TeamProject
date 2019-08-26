package com.spring.test;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.dao.SellerDAO;
import com.spring.service.SellerSvc;
import com.spring.service.SellerSvcImple;
import com.spring.vo.SellerVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class SellerDAOTest {
	
	@Inject
	private SellerDAO sdao;
	private SellerSvc ssvc;
	
	@Test
	public void insertTest() {
		SellerVO svo = new SellerVO();		 
		svo.setSellID("STester2");
		svo.setSellPw("1q2w3e4r@");
		svo.setSellName("판매자테스터2");
		svo.setSellPN("098-765-4321");
		svo.setSellAdd1("서울시 종로구 관철동");
		svo.setSellAdd2("솔데스크 802-1");
		//sdao.insertSeller(svo);
		ssvc.write(svo);
	}
}
