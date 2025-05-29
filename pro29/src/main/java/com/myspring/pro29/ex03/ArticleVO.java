package com.myspring.pro29.ex03;

import lombok.Data;

@Data
public class ArticleVO {

	private int articleNO;
	private String writer;
	private String title;
	private String content;

	@Override
	public String toString() {
		String info = "";
		info += "\n" + articleNO + "\n " + writer + "\n" + title + "\n" + content;

		return info;
	}

} // class 끝
