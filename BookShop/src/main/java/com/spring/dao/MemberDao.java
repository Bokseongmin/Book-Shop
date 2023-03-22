package com.spring.dao;

import org.springframework.stereotype.Repository;

import com.spring.vo.MemberVo;

@Repository
public class MemberDao extends CommonDao{

	public void signup(MemberVo vo) {
		getSqlSession().insert("mmapper.signup", vo);
	}
	
	public MemberVo signin(MemberVo vo) {
		return getSqlSession().selectOne("mmapper.signin", vo);
	}
}
