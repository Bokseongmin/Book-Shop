package com.spring.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.dao.HomeDao;
import com.spring.vo.BookVo;

@Service
public class HomeServiceImpl implements HomeService{
	
	@Resource
	HomeDao dao;
	
	public List<BookVo> top3() throws Exception {
		return dao.top3();
	}
}
