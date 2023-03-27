package com.spring.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.dao.GlobalDao;
import com.spring.vo.BookVo;

@Service
public class GlobalServiceImpl implements GlobalService{
	
	@Resource
	private GlobalDao dao;
	
	public List<BookVo> list(String country, String keyword, String category) throws Exception {
		return dao.list(country, keyword, category);
	}
	
}
