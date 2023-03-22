package com.spring.service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

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

	public MemberVo signin(MemberVo vo) throws Exception {
		return dao.signin(vo);
	}

	public void signout(HttpSession session) throws Exception {
		session.invalidate();
	}
}
