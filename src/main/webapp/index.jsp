<%@page import="login_proj.ds.JndiDS"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Index</title>
</head>
<body>
	<%=JndiDS.getConnection() %><br>
	<c:if test="${sessionScope.id eq null }" >
		<a href="loginForm.jsp">로그인</a>
	</c:if>
	<c:if test="${sessionScope.id ne null }" >
		<a href="logout">로그아웃</a>
	</c:if>
</body>
</html>