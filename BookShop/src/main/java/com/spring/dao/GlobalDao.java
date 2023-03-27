package com.spring.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.spring.vo.BookVo;

@Repository
public class GlobalDao extends CommonDao{
	
	public List<BookVo> list(String country, String keyword, String category) throws Exception {
		Map<String, Object> params = new HashMap<>();
		params.put("country", country);
	    params.put("keyword", keyword);
	    params.put("category", category);
	    List<BookVo> list = getSqlSession().selectList("gmapper.list", params);
		return list;
	}
}
