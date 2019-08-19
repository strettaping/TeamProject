<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login.jsp</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$('#signInBtn').click(function(){
			location.href = "/team1/signin"
		});
	});
</script>
</head>
<body>
	<h1>로그인화면</h1>
	<div>
		<div>
			ID : <input type="text" name="id" id="id" /> <br />
			PW : <input type="text" name="pw" id="pw" />
		</div>		
		<div>
			<button id="loginBtn" class="btn btn-primary">로그인</button>
			<button id="signInBtn" class="btn btn-success">회원가입</button>
		</div>
		
		
		
	</div>
</body>
</html>