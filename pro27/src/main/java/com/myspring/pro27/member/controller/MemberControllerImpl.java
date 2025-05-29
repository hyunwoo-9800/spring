package com.myspring.pro27.member.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.myspring.pro27.member.service.MemberService;
import com.myspring.pro27.member.vo.MemberVO;


// 컨트롤러 인터페이스 구현 객체
@Controller("memberController")
public class MemberControllerImpl implements MemberController {
	
	private static final Logger logger = LoggerFactory.getLogger(MemberControllerImpl.class);

	// 서비스, vo 객체 인스턴스화
	@Autowired
	private MemberService memberService;
	@Autowired
	private MemberVO memberVO;

	// 회원 조회 페이지
	@Override
	@RequestMapping(value = "/member/listMembers.do", method = RequestMethod.GET)
	public ModelAndView listMembers(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		List membersList = memberService.listMembers();
		ModelAndView mav = new ModelAndView("member/listMembers");
		
		// 로그 설정
		logger.info("info 레벨 = " + mav.getViewName());
		logger.debug("debug 레벨 = " + mav.getViewName());
		
		mav.addObject("membersList", membersList);

		return mav;
	}

	// 회원 등록 페이지
	@Override
	@RequestMapping(value = "/member/addMember.do", method = RequestMethod.POST)
	public ModelAndView addMember(@ModelAttribute("member") MemberVO member, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		// 회원 가입 날짜 세팅
		member.setJoinDate(new java.sql.Date(System.currentTimeMillis()));
		
		request.setCharacterEncoding("utf-8");
		int result = 0;
		result = memberService.addMember(member);
		ModelAndView mav = new ModelAndView("redirect:/member/listMembers.do");
		
		// 로그 설정
		logger.info("info 레벨 = " + mav.getViewName());
		logger.debug("debug 레벨 = " + mav.getViewName());
		
		return mav;
		
	}

	// 회원 삭제 페이지
	@Override
	@RequestMapping(value = "/member/removeMember.do", method = RequestMethod.GET)
	public ModelAndView removeMember(@RequestParam("id") String id, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		
		request.setCharacterEncoding("utf-8");
		memberService.removeMember(id);
		ModelAndView mav = new ModelAndView("redirect:/member/listMembers.do");
		
		// 로그 설정
		logger.info("info 레벨 = " + mav.getViewName());
		logger.debug("debug 레벨 = " + mav.getViewName());
		
		return mav;
	}

	/*
	 * @RequestMapping(value = { "/member/loginForm.do", "/member/memberForm.do" },
	 * method = RequestMethod.GET)
	 */
	@RequestMapping(value = "/member/*Form.do", method = RequestMethod.GET)
	public ModelAndView form(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		ModelAndView mav = new ModelAndView("member/memberForm");
		
		// 로그 설정
		logger.info("info 레벨 = " + mav.getViewName());
		logger.debug("debug 레벨 = " + mav.getViewName());
		
		return mav;
	}

} // class 끝
