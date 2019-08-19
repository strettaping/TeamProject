<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>buyerSignIn.jsp</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$('#submitBtn').click(function(){
			document.frm.method = "post";
			$(this).submit();
			location.href = "<c:url value='buyerSignInCheck'></c:url>"
		});
	});
</script>
</head>
<body>	
	<form name="frm" method="post">
		<div id="container">
			<div id="idDiv">
				ID : <input type="text" name="Bid" id="Bid" /> <button>중복확인</button><br />
			</div>
			
			<div id="pwDiv">
				PW : <input type="text" name="Bpw" id="Bpw" placeholder="영어 숫자 조합으로 8자 이상" /><br />
			</div>
			
			<div id="nameDiv">
				이름 : <input type="text" name="Bname" id="Bname" /><br />
			</div>
			
			<div id="pNumDiv">
				전화번호 : <input type="text" name="BpNum" id="BpNum" />
			</div>
			
			<div id="AddDiv">
				주소 : <input type="text" name="Badd1" id="Badd1" placeholder="시/구/동"/> <br />
				나머지 주소 : <input type="text" name="Badd2" id="Badd2" />
			</div>
			
			<button id="submitBtn">등록</button>
			<button id="cancelBtn">취소</button>
		</div>
	</form>
</body>
</html>