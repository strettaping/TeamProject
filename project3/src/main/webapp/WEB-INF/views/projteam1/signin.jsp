<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$('#seller').click(function(){
			location.href='<c:url value="/team1/sellersignin"></c:url>'
		});
		
		$('#buyer').click(function(){
			self.location='<c:url value="/team1/buyersignin"></c:url>';
		});
	});
</script>
<meta charset="UTF-8">
<title>signin.jsp</title>
</head>
<body>
	<div id="container">
		<button id="seller">판매자로 회원가입</button>
		<button id="buyer">구매자로 회원가입</button>
	</div>	
</body>
</html>