<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
<style type="text/css">
	td{
	width:300px;
	height:200px;
	border: 1px solid #444444;
}
</style>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1 align=center>Category : ${category }</h1>
	<table>
	
				<c:forEach var="lc" items="${list }">
				<tr>
					<td>
					가게명 : ${lc.sName } <br />
					전화번호 : ${lc.sPNumber } <br />
					주소 : ${lc.address }<br />
					</td>
				</tr>
				</c:forEach>

	</table>
</body>
</html>