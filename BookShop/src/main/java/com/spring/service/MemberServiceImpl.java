package com.spring.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.dao.MemberDao;
import com.spring.vo.MemberVo;

@Service
public class MemberServiceImpl implements MemberService {
	
	@Resource
	MemberDao dao;
	
	public void signup(MemberVo vo) throws Exception {
		dao.signup(vo);
	}
}
