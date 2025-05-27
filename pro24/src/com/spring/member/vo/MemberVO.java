package com.spring.member.vo;

import java.sql.Date;

import lombok.Data;

// 멤버를 담기 위한 클래스
@Data
public class MemberVO {
	private String id;
	private String pwd;
	private String name;
	private String email;
	private Date joinDate;

	public MemberVO() {

	}

	public MemberVO(String id, String pwd, String name, String email) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
	}

} // class 끝
