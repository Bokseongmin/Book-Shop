package com.spring.service;

import com.spring.vo.MemberVo;

public interface MemberService {
	
	// 가입
	public void signup(MemberVo vo) throws Exception;
}
