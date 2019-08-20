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
		// ID 중복 확인
		
		
		
		$('#submitBtn').click(function(){
			if($("#BuyID").val() == null){
				alert("아이디를 입력해주세요.")
			}
			document.frm.method = "post";
			$(this).submit();
			location.href='<c:url value=""></c:url>';
		});
		
		$('#cancelBtn').click(function(){
			location.href='<c:url value=""></c:url>';
		})
	});
</script>
</head>
<body>	
	<form name="frm" method="post">
		<div id="container">
			<div id="idDiv">
				아이디 : <input type="text" name="BuyID" id="BuyID" /> <button>중복확인</button><br />
			</div>
			
			<div id="pwDiv">
				비밀번호 : <input type="text" name="BuyPw" id="BuyPw" placeholder="영어 숫자 조합으로 8자 이상" /><br />
			</div>
			
			<div id="nameDiv">
				이름 : <input type="text" name="BuyName" id="BuyName" /><br />
			</div>
			
			<div id="pNumDiv">
				전화번호 : <input type="text" name="BuyPN" id="BuyPN" />
			</div>
			
			<div id="AddDiv">
				주소 : <input type="text" name="BuyAdd1" id="BuyAdd1" placeholder="시/구/동"/> <br />
				나머지 주소 : <input type="text" name="BuyAdd2" id="BuyAdd2" />
			</div>
			
			<button id="submitBtn">등록</button>
			<button id="cancelBtn">취소</button>
		</div>
	</form>
</body>
</html>