<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style>
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

#content {
	width: 75%;
	padding: 5px;
	margin-right: 5px;
	float: left;
	border: 0px solid #bcbcbc;
}

#footer {
	clear: both;
	padding: 5px;
	border: 0px solid #bcbcbc;
	background-color: lightblue;
}
</style>
<title>${pageTitle}</title>
</head>
<body>
	<div id="container">
		<div id="header">
			<jsp:include page="/WEB-INF/views/common/header.jsp" />
		</div>
		<div id="sidebar-left">
			<jsp:include page="/WEB-INF/views/common/side.jsp" />
		</div>
		<div id="content">
			<jsp:include page="${bodyPage}" />
		</div>
		<div id="footer">
			<jsp:include page="/WEB-INF/views/common/footer.jsp" />
		</div>
	</div>
</body>
</html>