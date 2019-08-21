package com.spring.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.spring.vo.StoreVO;

@Repository
public class StoreDAOImple implements StoreDAO {
	
	@Inject
	SqlSession ss;

	@Override
	public List<StoreVO> listCategory(String category) {
		// TODO Auto-generated method stub
		return ss.selectList("selectByCategory", category);
	}

	@Override
	public List<StoreVO> listsNameAdd(String sName, String address) {
		// TODO Auto-generated method stub
		Map<String, String> storeMap = new HashMap<String, String>();
		storeMap.put("sName", sName);
		storeMap.put("address", address);
		return ss.selectList("selectBysNameAndAdd", storeMap);
	}

	@Override
	public void insert(StoreVO stvo) {
		ss.insert("insertBySellID", stvo);
	}

	@Override
	public void update(Integer sID) {
		ss.update("updateBySID", sID);

	}

	@Override
	public void delete(Integer sID) {
		ss.delete("deleteBySID", sID);

	}

}
