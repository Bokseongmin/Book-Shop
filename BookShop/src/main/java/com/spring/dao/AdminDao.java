package com.spring.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.vo.MemberVo;

@Repository
public class AdminDao extends CommonDao{
	
	// 회원 목록
	public List<MemberVo> list() {
		return getSqlSession().selectList("amapper.list");
	}
}
