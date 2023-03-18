package com.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.vo.BookVo;

@Repository
public class BookDao extends CommonDao{
	
	public List<BookVo> list() throws Exception {
		List<BookVo> list = getSqlSession().selectList("mapper.list");
		return list;
	}
	
	public void insert(BookVo vo) throws Exception {
		getSqlSession().insert("mapper.insert", vo);
	}
	
	public BookVo detail(int book_id) throws Exception {
		return getSqlSession().selectOne("mapper.detail", book_id);
	}
	
	public void update(BookVo vo) {
		getSqlSession().update("mapper.update", vo);
	}
	
	public void delete(BookVo vo) {
		getSqlSession().delete("mapper.delete", vo);
	}
}
