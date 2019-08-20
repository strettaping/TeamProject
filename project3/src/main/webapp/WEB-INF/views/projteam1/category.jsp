<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Category : ${category }</h2>
	
	<c:forEach var="lc" items="${list }">
		카테고리 : ${lc.category } <br />
		가게명 : ${lc.sName } <br />
		전화번호 : ${lc.sPNumber } <br />
		주소 : ${lc.address }
	</c:forEach>
</body>
</html>