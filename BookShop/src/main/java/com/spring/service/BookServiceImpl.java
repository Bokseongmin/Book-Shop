package com.spring.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.dao.BookDao;
import com.spring.vo.BookVo;

@Service
public class BookServiceImpl implements BookService{
	
	@Resource
	private BookDao dao;

	public List<BookVo> list(String keyword) throws Exception {
		return dao.list(keyword);
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
