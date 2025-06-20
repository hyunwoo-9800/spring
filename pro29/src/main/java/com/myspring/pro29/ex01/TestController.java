package com.myspring.pro29.ex01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// REST API 예제 컨트롤러
@RestController
@RequestMapping("/test/*")
public class TestController {

	static Logger logger = LoggerFactory.getLogger(TestController.class);

	@RequestMapping("/hello")
	public String hello() {

		return "Hello REST!!!";

	}

	@RequestMapping("/member")
	public MemberVO member() {

		MemberVO vo = new MemberVO();
		vo.setId("비");
		vo.setPwd("9999");
		vo.setName("둘기");
		vo.setEmail("비둘기@test.com");

		return vo;

	}

	@RequestMapping("/membersList")
	public List<MemberVO> listMembers() {
		List<MemberVO> list = new ArrayList<MemberVO>();
		for (int i = 0; i < 10; i++) {
			
			MemberVO vo = new MemberVO();
			
			vo.setId("gugu" + i);
			vo.setPwd("9999" + i);
			vo.setName("비둘기" + i);
			vo.setEmail("gugu" + i + "@test.com");
			
			list.add(vo);
		}
		
		return list;
	}

	@RequestMapping("/membersMap")
	public Map<Integer, MemberVO> membersMap() {
		Map<Integer, MemberVO> map = new HashMap<Integer, MemberVO>();
		for (int i = 0; i < 10; i++) {
			
			MemberVO vo = new MemberVO();
			vo.setId("gugu" + i);
			vo.setPwd("9999" + i);
			vo.setName("비둘기" + i);
			vo.setEmail("gugu" + i + "@test.com");
			
			map.put(i, vo);
		}
		
		return map;
	}

	@RequestMapping(value = "/notice/{num}", method = RequestMethod.GET)
	public int notice(@PathVariable("num") int num) throws Exception {
		
		return num;
		
	}

	@RequestMapping(value = "/info", method = RequestMethod.POST)
	public void modify(@RequestBody MemberVO vo) {
		
		logger.info(vo.toString());
		
	}

	@RequestMapping("/membersList2")
	public ResponseEntity<List<MemberVO>> listMembers2() {
		
		List<MemberVO> list = new ArrayList<MemberVO>();
		for (int i = 0; i < 10; i++) {
			
			MemberVO vo = new MemberVO();
			vo.setId("gugu" + i);
			vo.setPwd("9999" + i);
			vo.setName("비둘기" + i);
			vo.setEmail("gugu" + i + "@test.com");
			
			list.add(vo);
			
		}
		
		return new ResponseEntity(list, HttpStatus.INTERNAL_SERVER_ERROR);
	}

	@RequestMapping(value = "/res3")
	public ResponseEntity res3() {
		
		HttpHeaders responseHeaders = new HttpHeaders();
		responseHeaders.add("Content-Type", "text/html; charset=utf-8");
		String message = "<script>";
		message += " alert('새 회원을 등록합니다.');";
		message += " location.href='/pro29/test/membersList2'; ";
		message += " </script>";
		
		return new ResponseEntity(message, responseHeaders, HttpStatus.CREATED);
	}

} // class 끝
