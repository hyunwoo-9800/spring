package com.myspring.pro30.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;

// 게시판 컨트롤러 인터페이스
public interface BoardController {

	// 전체 게시글
	public ModelAndView listArticles(HttpServletRequest request, HttpServletResponse response) throws Exception;

	// 게시글 등록
	public ResponseEntity addNewArticle(MultipartHttpServletRequest multipartRequest, HttpServletResponse response)
			throws Exception;

	// 게시글 상세 보기
	public ModelAndView viewArticle(@RequestParam("articleNO") int articleNO, HttpServletRequest request,
			HttpServletResponse response) throws Exception;

	// public ResponseEntity modArticle(MultipartHttpServletRequest
	// multipartRequest, HttpServletResponse response) throws Exception;
	public ResponseEntity removeArticle(@RequestParam("articleNO") int articleNO, HttpServletRequest request,
			HttpServletResponse response) throws Exception;

} // 인터페이스 끝
