package com.myspring.pro27.member.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;

import lombok.Data;

// 회원 정보 저장 클래스
@Component("memberVO")
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
	
	public MemberVO(String id, String pwd, String name, String email, Date joinDate) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.email = email;
		this.joinDate = joinDate;
	}

} // class 끝
