package com.myspring.pro27.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.myspring.pro27.member.vo.MemberVO;

// 컨트롤러 인터페이스
public interface MemberController {

	// 회원 조회
	public ModelAndView listMembers(HttpServletRequest request, HttpServletResponse response) throws Exception;

	// 회원 등록
	public ModelAndView addMember(@ModelAttribute("info") MemberVO memberVO, HttpServletRequest request,
			HttpServletResponse response) throws Exception;

	// 회원 삭제
	public ModelAndView removeMember(@RequestParam("id") String id, HttpServletRequest request,
			HttpServletResponse response) throws Exception;

} // 인터페이스 끝
