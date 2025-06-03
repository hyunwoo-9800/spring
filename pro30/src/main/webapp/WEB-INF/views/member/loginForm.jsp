<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>

<html>

	<head>
		<meta charset="UTF-8">
		<title>로그인창</title>
		<c:choose>
			<c:when test="${result=='loginFailed' }">
				<script>
					window.onload = function() {
						alert("아이디나 비밀번호가 틀립니다.다시 로그인 하세요!");
					}
				</script>
			</c:when>
		</c:choose>
		
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
		
			<form name="frmLogin" method="post" action="${contextPath}/member/login.do">
			
				<table border="1" width="80%" align="center">
				
					<tr align="center">
						<td>아이디</td>
						<td>비밀번호</td>
					</tr>
					
					<tr align="center">
						<td>
							<input type="text" name="id" value="" size="20">
						</td>
						<td>
							<input type="password" name="pwd" value="" size="20">
						</td>
					</tr>
					
					<tr align="center">
						<td colspan="2">
							<input type="submit" value="로그인">
							<input type="reset" value="다시입력">
						</td>
					</tr>
					
				</table>
				
			</form>
			
			<div id="footer">
				<jsp:include page="/WEB-INF/views/common/footer.jsp" />
			</div>
			
		</div>
		
	</body>
	
</html>