package com.spring.member.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;
import com.spring.member.vo.MemberVO;

// 매퍼 인터페이스
public interface MemberDAO {
	
	// 전체 멤버 조회
	public List selectAllMemberList() throws DataAccessException;

	// 멤버 추가
	public int insertMember(MemberVO memberVO) throws DataAccessException;

	// 멤버 삭제
	public int deleteMember(String id) throws DataAccessException;
	
} // 인터페이스 끝
