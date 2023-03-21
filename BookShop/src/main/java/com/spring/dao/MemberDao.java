package com.spring.dao;

import org.springframework.stereotype.Repository;

import com.spring.vo.MemberVo;

@Repository
public class MemberDao extends CommonDao{

	public void signup(MemberVo vo) {
		getSqlSession().insert("mmapper.signup", vo);
	}
}
