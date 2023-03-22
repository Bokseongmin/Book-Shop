package com.spring.service;

import java.util.List;

import com.spring.vo.BookVo;

public interface HomeService {
	
	public List<BookVo> top3() throws Exception;
}
