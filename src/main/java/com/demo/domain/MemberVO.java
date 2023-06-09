package com.demo.domain;

public class MemberVO {
	
	private String u_id;
	private String u_pw;
	
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public String getU_pw() {
		return u_pw;
	}
	public void setU_pw(String u_pw) {
		this.u_pw = u_pw;
	}
	
	@Override
	public String toString() {
		return "MemberVO [u_id=" + u_id + ", u_pw=" + u_pw + "]"; // 현재 클래스 정보를 반환하는 용도
	}
	
}
