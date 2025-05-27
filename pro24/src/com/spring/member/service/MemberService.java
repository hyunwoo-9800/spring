package com.spring.member.service;

import java.util.List;

import org.springframework.dao.DataAccessException;
import com.spring.member.vo.MemberVO;

// 서비스 인터페이스
public interface MemberService {

	// 전체 멤버 출력
	public List listMembers() throws DataAccessException;

	// 멤버 추가
	public int addMember(MemberVO membeVO) throws DataAccessException;

	// 멤버 삭제
	public int removeMember(String id) throws DataAccessException;

} // 인터페이스 끝
