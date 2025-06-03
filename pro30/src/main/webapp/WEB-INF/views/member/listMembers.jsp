<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>

<html>

	<head>
		<meta charset="UTF-8">
		<title>회원 정보 출력창</title>
		
		<style type="text/css">
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
			
			#container {
				width: 100%;
				margin: 0px auto;
				text-align: center;
				border: 0px solid #bcbcbc;
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
	
	<body>
	
	<div id="container">
	
		 	<div id="header">
				<jsp:include page="/WEB-INF/views/common/header.jsp" />
			</div>
			
			<div id="sidebar-left">
				<jsp:include page="/WEB-INF/views/common/side.jsp" />
			</div>
			
			<table border="1" align="center" width="80%">
			
				<tr align="center" bgcolor="lightgreen">
					<td><b>아이디</b></td>
					<td><b>비밀번호</b></td>
					<td><b>이름</b></td>
					<td><b>이메일</b></td>
					<td><b>가입일</b></td>
					<td><b>삭제</b></td>
				</tr>
		
				<c:forEach var="member" items="${membersList}">
					<tr align="center">
						<td>${member.id}</td>
						<td>${member.pwd}</td>
						<td>${member.name}</td>
						<td>${member.email}</td>
						<td>${member.joinDate}</td>
						<td>
							<a href="${contextPath}/member/removeMember.do?id=${member.id }">삭제하기</a>
						</td>
					</tr>
				</c:forEach>
				
			</table>
			
			<h1 style="text-align: center">
				<a href="${contextPath}/member/memberForm.do">
					회원가입
				</a>
			</h1>
			
			<div id="footer">
				<jsp:include page="/WEB-INF/views/common/footer.jsp" />
			</div>
			
		</div>	
		
	</body>
	
</html>
