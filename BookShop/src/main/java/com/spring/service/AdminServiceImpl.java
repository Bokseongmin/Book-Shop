package com.spring.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.dao.AdminDao;
import com.spring.vo.MemberVo;

@Service
public class AdminServiceImpl implements AdminService{
	
	@Resource
	AdminDao dao;
	
	public List<MemberVo> list() throws Exception{
		return dao.list();
	}
}
