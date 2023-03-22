package com.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.vo.BookVo;

@Repository
public class HomeDao extends CommonDao{
	
	public List<BookVo> top3() throws Exception {
		List<BookVo> list = getSqlSession().selectList("hmapper.top3");
		return list;
	}
}
