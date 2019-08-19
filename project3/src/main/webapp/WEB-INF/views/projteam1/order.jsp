<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>        
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>order.jsp</title>
<style type="text/css">
	.big-area{
	  float: left;
	  width: 950px;
	  height: 950px;
	  margin: 0 10px 0 0;
	  padding: 10px;
	  background: #999
	}
	.small-unit {
	  float: left;
	  width: 300px;
	  height:300px;
	  color: #fff;
	  background: #333;
	  margin: 1px;
	  text-align: center;
	}
	
	img{
		width: 200px;
	 	 height:200px;
	}
	
	#loginBtn{
	width : 150px;
	height : 30px;
	background-color: #333;
	color: white;
	text-align: center;
	}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){		
		$(".small-unit").click(function(){
			
			var category = $(this).text().trim();
			//console.log(category);
			//console.log($(this).text().trim());
			
			location.href='<c:url value="'+category+'"></c:url>';
		});
		
		$("#loginBtn").click(function(){
			location.href='<c:url value="login"></c:url>'
		});
	});
</script>
</head>
<body>	
	<div class="float-frame" > 	
		<div class="big-area">
			<div id="loginBtn">로그인 | 회원가입</div>
			<form name = "frm">
			    <div class="small-unit" >1인분 
			    	<img src="../../../resources/ProjectPic/간식.jpg" alt="간식" class="btn" ><!-- 원래는 1인분임. -->
			    </div>	    
			    <div class="small-unit">편의점
			    	<img src="../../../resources/ProjectPic/간식.jpg" alt="편의점" class="btn" id="편의점"/>			    		    	
			    </div>	  
			    <div class="small-unit">족발·보쌈
			    	<img src="../../../resources/ProjectPic/간식.jpg" alt="편의점" class="btn" id="족발/보쌈"/>
			    </div>
			    <div class="small-unit">한식
			    	<img src="../../../resources/ProjectPic/한식.jpg" alt="편의점" class="btn" id="한식"/>
			    </div>
			    <div class="small-unit">양식
			    	<img src="../../../resources/ProjectPic/양식.jpg" alt="편의점" class="btn" id="양식"/>
			    </div>
			    <div class="small-unit">중식
			    	<img src="../../../resources/ProjectPic/중식.jpg" alt="편의점" class="btn" id="중식"/>
			    </div>
			    <div class="small-unit">치킨
			    	<img src="../../../resources/ProjectPic/간식.jpg" alt="편의점" class="btn" id="치킨"/>
			    </div>
			    <div class="small-unit">피자
			    	<img src="../../../resources/ProjectPic/간식.jpg" alt="편의점" class="btn" id="피자"/>
			    </div>
			    <div class="small-unit">햄버거
			    	<img src="../../../resources/ProjectPic/간식.jpg" alt="편의점" class="btn" id="햄버거"/>
			    </div>
			</form>
		</div>
	</div>
</body>
</html>