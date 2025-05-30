package com.myspring.pro30.member.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.myspring.pro30.member.vo.MemberVO;

// 서비스 인터페이스
public interface MemberService {
	
	// 회원 조회
	public List listMembers() throws DataAccessException;

	// 회원 등록
	public int addMember(MemberVO memberVO) throws DataAccessException;

	// 회원 삭제
	public int removeMember(String id) throws DataAccessException;

	// 로그인
	public MemberVO login(MemberVO memberVO) throws Exception;
	
} // 인터페이스 끝
