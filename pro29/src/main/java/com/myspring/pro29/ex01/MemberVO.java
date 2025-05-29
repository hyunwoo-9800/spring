package com.myspring.pro29.ex01;

import lombok.Data;

@Data
// 회원 정보 저장객체
public class MemberVO {

	private String id;
	private String pwd;
	private String name;
	private String email;

	@Override
	public String toString() {
		String info = id + ", " + pwd + ", " + name + ", " + email;
		return info;
	}

} // class 끝
