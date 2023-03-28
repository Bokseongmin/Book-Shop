package com.spring.service;

import java.util.List;

import com.spring.vo.MemberVo;

public interface AdminService {
	
	// 회원 목록
	public List<MemberVo> list() throws Exception;
}
