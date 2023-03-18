package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.dao.BookDao;
import com.spring.vo.BookVo;

@Service
public class BookServiceImpl implements BookService{
	
	@Autowired
	private BookDao dao;

	public List<BookVo> list() throws Exception {
		return dao.list();
	}

	public void insert(BookVo vo) throws Exception {
		dao.insert(vo);
	}

	public BookVo detail(int book_id) throws Exception {
		return dao.detail(book_id);
	}

	public void update(BookVo vo) throws Exception {
		dao.update(vo);
	}

	public void delete(BookVo vo) throws Exception {
		dao.delete(vo);
	}
}
