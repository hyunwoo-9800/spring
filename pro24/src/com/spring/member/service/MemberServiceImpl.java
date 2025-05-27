package com.spring.member.service;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.spring.member.dao.MemberDAO;
import com.spring.member.vo.MemberVO;

/*@Transactional(propagation=Propagation.REQUIRED) */
// 서비스 구현 객체
public class MemberServiceImpl implements MemberService {
	
	// 매퍼 인스턴스화
	private MemberDAO memberDAO;

	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	@Override
	// 전체 멤버 조회
	public List listMembers() throws DataAccessException {
		List membersList = null;
		membersList = memberDAO.selectAllMemberList();
		return membersList;
	}

	@Override
	// 멤버 추가
	public int addMember(MemberVO memberVO) throws DataAccessException {
		return memberDAO.insertMember(memberVO);
	}

	@Override
	// 멤버 삭제
	public int removeMember(String id) throws DataAccessException {
		return memberDAO.deleteMember(id);
	}
} // class 끝
