package com.spring.test;

import java.util.List;

import javax.inject.Inject	;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.spring.dao.StoreDAO;
import com.spring.vo.StoreVO;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/root-context.xml"})
public class StoreDAOTest {
	
	@Inject
	private StoreDAO stdao;
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
	
	@Test 
	public void InsertTest() {		
		StoreVO stvo = new StoreVO();
		
		stvo.setAddress("서울시 마포구 아현동");
		stvo.setCategory("OnePerson");
		stvo.setMenu("중화만두");
		stvo.setPrice(3000);
		stvo.setSellID("Xae");
		stvo.setsName("현무살법고수");
		stvo.setsPNumber("111-2222-3333"); 
		stdao.insert(stvo);
	}
	
	 	
	/*
	@Test 
	public void searchTest() { 
		
		List<StoreVO> list = stdao.listCategory("Convinient");
	
		for(StoreVO svo : list) { 
			System.out.println("가게명 : " + svo.getsName()); 
		} 
	}
	*/
	
}
