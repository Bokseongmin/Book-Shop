package com.spring.service;

import java.util.List;

import com.spring.vo.BookVo;

public interface BookService {
	
	// 책 목록
	public List<BookVo> list() throws Exception;
	
	// 책 생성
	public void insert(BookVo vo) throws Exception;
	
	// 책 조회
	public BookVo detail(int book_id) throws Exception;
	
	// 책 수정
	public void update(BookVo vo) throws Exception;
	
	// 책 삭제
	public void delete(BookVo vo) throws Exception;
}
