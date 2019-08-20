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
	                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                          
	/*
	@Test 
	public void InsertTest() {		
		StoreVO stvo = new StoreVO();
		
		stvo.setAddress("경기도 부천시 원미구");
		stvo.setCategory("OnePerson");
		stvo.setMenu("1인분 도시락");
		stvo.setPrice(3000);
		stvo.setSellID("Won");
		stvo.setsName("원미동 사람들");
		stvo.setsPNumber("101-2112-3113"); 
		stdao.insert(stvo);
	}
	*/
	 	
	/*
	@Test 
	public void searchTest() { 
		
		List<StoreVO> list = stdao.listCategory("Convinient");
	
		for(StoreVO svo : list) { 
			System.out.println("가게명 : " + svo.getsName()); 
		} 
	}
	*/
	
	@Test
	public void searchTest2() {
		List<StoreVO> list = stdao.listsNameAdd("솔데스크 도시락", "서울시 종로구 관철동");
		for(StoreVO svo : list) {
			System.out.println("메뉴 : " + svo.getMenu());
		}
	}
	
}
