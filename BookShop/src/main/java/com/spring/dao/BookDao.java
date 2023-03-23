package com.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.vo.BookVo;

@Repository
public class BookDao extends CommonDao{
	
	public List<BookVo> list(String keyword) throws Exception {
		List<BookVo> list = getSqlSession().selectList("bmapper.list", keyword);
		return list;
	}
	
	public void insert(BookVo vo) throws Exception {
		getSqlSession().insert("bmapper.insert", vo);
	}
	
	public BookVo detail(int book_id) throws Exception {
		getSqlSession().update("bmapper.view_cnt", book_id);
		return getSqlSession().selectOne("bmapper.detail", book_id);
	}
	
	public void update(BookVo vo) {
		getSqlSession().update("bmapper.update", vo);
	}
	
	public void delete(BookVo vo) {
		getSqlSession().delete("bmapper.delete", vo);
	}
}
