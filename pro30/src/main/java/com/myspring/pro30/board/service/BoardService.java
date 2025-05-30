package com.myspring.pro30.board.service;

import java.util.List;
import java.util.Map;

import com.myspring.pro30.board.vo.ArticleVO;

// 서비스 인터페이스
public interface BoardService {
	public List<ArticleVO> listArticles() throws Exception;

	public int addNewArticle(Map articleMap) throws Exception;

	public ArticleVO viewArticle(int articleNO) throws Exception;

	// public Map viewArticle(int articleNO) throws Exception;
	public void modArticle(Map articleMap) throws Exception;

	public void removeArticle(int articleNO) throws Exception;

} // 인터페이스 끝
