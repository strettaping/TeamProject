<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>buyerSignIn.jsp</title>
</head>
<body>
	<form name="frm" method="post">
		<div id="container">
			<div id="idDiv">
				ID : <input type="text" name="id" id="id" /> <button>중복확인</button><br />
			</div>
			
			<div id="pwDiv">
				PW : <input type="text" name="pw" id="pw" placeholder="영어 숫자 조합으로 8자 이상" /><br />
			</div>
			
			<div id="nameDiv">
				이름 : <input type="text" name="name" id="name" /><br />
			</div>
			
			<div id="pNumDiv">
				전화번호 : <input type="text" name="pNum" id="pNum" />
			</div>
			
			<div id="AddDiv">
				주소 : <input type="text" name="add1" id="add1" placeholder="시/구/동"/> <br />
				나머지 주소 : <input type="text" name="add2" id="add2" />
			</div>
			
			<button id="submitBtn">등록</button>
			<button id="cancelBtn">취소</button>
		</div>
	</form>
</body>
</html>