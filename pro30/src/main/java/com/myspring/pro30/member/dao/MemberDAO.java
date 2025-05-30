package com.myspring.pro30.member.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.myspring.pro30.member.vo.MemberVO;

// 매퍼 인터페이스
public interface MemberDAO {
	
	// 회원 조회
	public List selectAllMemberList() throws DataAccessException;

	// 회원 등록
	public int insertMember(MemberVO memberVO) throws DataAccessException;

	// 회원 삭제
	public int deleteMember(String id) throws DataAccessException;

	// 로그인
	public MemberVO loginById(MemberVO memberVO) throws DataAccessException;

} // 인터페이스 끝
