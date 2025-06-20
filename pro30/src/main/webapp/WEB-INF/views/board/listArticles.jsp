<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>

<html>

	<head>
		<meta charset="UTF-8">
		<title>글목록창</title>
		<style>
		.cls1 {
			text-decoration: none;
		}
		
		.cls2 {
			text-align: center;
			font-size: 30px;
		}
		
		#container {
			width: 100%;
			margin: 0px auto;
			text-align: center;
			border: 0px solid #bcbcbc;
		}
		
		#sidebar-left {
			width: 15%;
			height: 700px;
			padding: 5px;
			margin-right: 5px;
			margin-bottom: 5px;
			float: left;
			background-color: yellow;
			border: 0px solid #bcbcbc;
			font-size: 10px;
			}
			
		#header {
			padding: 5px;
			margin-bottom: 5px;
			border: 0px solid #bcbcbc;
			background-color: lightgreen;
		}
			
		#footer {
			clear: both;
			padding: 5px;
			border: 0px solid #bcbcbc;
			background-color: lightblue;
		}
		</style>
	</head>
	
	<script>
		function fn_articleForm(isLogOn, articleForm, loginForm) {
			if (isLogOn != '' && isLogOn != 'false') {
				location.href = articleForm;
			} else {
				alert("로그인 후 글쓰기가 가능합니다.")
				location.href = loginForm + '?action=/board/articleForm.do';
			}
		}
	</script>
	
	<body>
	
	<div id="container">
	
	 		<div id="header">
				<jsp:include page="/WEB-INF/views/common/header.jsp" />
			</div>
			
			<div id="sidebar-left">
				<jsp:include page="/WEB-INF/views/common/side.jsp" />
			</div>
			
			<table align="center" border="1" width="80%">
				<tr height="10" align="center" bgcolor="lightgreen">
					<td>글번호</td>
					<td>작성자</td>
					<td>제목</td>
					<td>작성일</td>
				</tr>
				
				<c:choose>
				
					<c:when test="${articlesList ==null }">
						<tr height="10">
							<td colspan="4">
								<p align="center">
									<b><span style="font-size: 9pt;">등록된 글이 없습니다.</span></b>
								</p>
							</td>
						</tr>
					</c:when>
					
					<c:when test="${articlesList !=null }">
						<c:forEach var="article" items="${articlesList }"
							varStatus="articleNum">
							<tr align="center">
							
								<td width="5%">${articleNum.count}</td>
								<td width="10%">${article.id }</td>
								<td align='left' width="35%">
								<span style="padding-right: 30px"></span>
								
								<c:choose>
									<c:when test='${article.level > 1 }'>
									
										<c:forEach begin="1" end="${article.level }" step="1">
											<span style="padding-left: 20px"></span>
										</c:forEach>
										
										<span style="font-size: 12px;">[답변]</span>
											<a class='cls1'
												href="${contextPath}/board/viewArticle.do?articleNO=${article.articleNO}">${article.title}</a>
										
										</c:when>
										
										<c:otherwise>
										
											<a class='cls1'
												href="${contextPath}/board/viewArticle.do?articleNO=${article.articleNO}">${article.title }</a>
										
										</c:otherwise>
										
									</c:choose>
									
								</td>
								
								<td width="10%">${article.writeDate}</td>
								
							</tr>
							
						</c:forEach>
						
					</c:when>
					
				</c:choose>
				
			</table>
			
			<p class="cls2">
				<a class="cls1"
					href="javascript:fn_articleForm('${isLogOn}','${contextPath}/board/articleForm.do', 
			                                                    '${contextPath}/member/loginForm.do')">
			    글쓰기
			    </a>
		    </p>
		    
		   	<div id="footer">
				<jsp:include page="/WEB-INF/views/common/footer.jsp" />
			</div>
		</div>
	
	</body>
	
</html>