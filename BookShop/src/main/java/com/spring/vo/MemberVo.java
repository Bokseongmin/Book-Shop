package com.spring.vo;

import java.util.Date;

public class MemberVo {
	private long member_id;
	private String name;
	private String user_id;
	private String pass;
	private Date insert_date;
	private int verify;
	
	public long getMember_id() {
		return member_id;
	}
	public void setMember_id(long member_id) {
		this.member_id = member_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Date getInsert_date() {
		return insert_date;
	}
	public void setInsert_date(Date insert_date) {
		this.insert_date = insert_date;
	}
	public int getVerify() {
		return verify;
	}
	public void setVerify(int verify) {
		this.verify = verify;
	}
	@Override
	public String toString() {
		return "MemberVo [member_id=" + member_id + ", name=" + name + ", user_id=" + user_id + ", pass=" + pass
				+ ", insert_date=" + insert_date + ", verify=" + verify + "]";
	}
}
