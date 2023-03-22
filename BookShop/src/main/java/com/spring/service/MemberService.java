package com.spring.service;

import javax.servlet.http.HttpSession;

import com.spring.vo.MemberVo;

public interface MemberService {
	
	// 가입
	public void signup(MemberVo vo) throws Exception;
	
	// 로그인
	public MemberVo signin(MemberVo vo) throws Exception;
	
	// 로그아웃
	public void signout(HttpSession session) throws Exception;
}
