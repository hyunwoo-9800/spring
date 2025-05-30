package com.myspring.pro30.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.myspring.pro30.member.vo.MemberVO;

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

	// 로그인
	public ModelAndView login(@ModelAttribute("member") MemberVO member, RedirectAttributes rAttr,
			HttpServletRequest request, HttpServletResponse response) throws Exception;

	// 로그아웃
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) throws Exception;

} // 인터페이스 끝