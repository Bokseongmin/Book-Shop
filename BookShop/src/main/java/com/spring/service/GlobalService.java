package com.spring.service;

import java.util.List;

import com.spring.vo.BookVo;

public interface GlobalService {
	
	// 목록
	public List<BookVo> list(String country, String keyword, String category) throws Exception;
}
