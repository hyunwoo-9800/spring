package com.spring.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

// 컨트롤러 인터페이스
public interface MemberController {
	
	// 전체 멤버 출력
	public ModelAndView listMembers(HttpServletRequest request, HttpServletResponse response) throws Exception;

	// 멤버 추가
	public ModelAndView addMember(HttpServletRequest request, HttpServletResponse response) throws Exception;

	// 멤버 삭제
	public ModelAndView removeMember(HttpServletRequest request, HttpServletResponse response) throws Exception;

} // 인터페이스 끝
