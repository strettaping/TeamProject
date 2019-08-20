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
		var list = ["1인분", "편의점", "족발·보쌈", "한식", "양식", "중식", "치킨", "피자", "햄버거"];
		
		$(".small-unit").click(function(){
			
			if($(this).text().trim() == list[0]){
				var category = "OnePerson";
				//console.log(category);				
			}else if($(this).text().trim() == list[1]){
				var category = "Convinient";
				
			}else if($(this).text().trim() == list[2]){
				var category = "JokBo";
				
			}else if($(this).text().trim() == list[3]){
				var category = "Korean";
				
			}else if($(this).text().trim() == list[4]){
				var category = "Western";
				
			}else if($(this).text().trim() == list[5]){
				var category = "Chinese";
				
			}else if($(this).text().trim() == list[6]){
				var category = "Chicken";
				
			}else if($(this).text().trim() == list[7]){
				var category = "Pizza";
				
			}else if($(this).text().trim() == list[8]){
				var category = "Burger";
				
			}
			
			location.href='<c:url value="/team1/list/'+category+'"></c:url>';		
			
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
			    	<input type="hidden" name="OnePerson" id="OnePerson" /> 
			    	<img src="../../../resources/ProjectPic/간식.jpg" alt="간식" class="btn" ><!-- 원래는 1인분임. -->
			    </div>	    
			    <div class="small-unit">편의점
			    	<input type="hidden" name="Convinient" id="Convinient" />
			    	<img src="../../../resources/ProjectPic/간식.jpg" alt="편의점" class="btn" id="편의점"/>			    		    	
			    </div>	  
			    <div class="small-unit">족발·보쌈
			    	<input type="hidden" name="JokBo" id="JokBo" />
			    	<img src="../../../resources/ProjectPic/간식.jpg" alt="편의점" class="btn" id="족발/보쌈"/>
			    </div>
			    <div class="small-unit">한식
			    	<input type="hidden" name="Korean" id="Korean" />
			    	<img src="../../../resources/ProjectPic/한식.jpg" alt="편의점" class="btn" id="한식"/>
			    </div>
			    <div class="small-unit">양식
			    	<input type="hidden" name="Western" id="Western" />
			    	<img src="../../../resources/ProjectPic/양식.jpg" alt="편의점" class="btn" id="양식"/>
			    </div>
			    <div class="small-unit">중식
			    	<input type="hidden" name="Chinese" id="Chinese"  />
			    	<img src="../../../resources/ProjectPic/중식.jpg" alt="편의점" class="btn" id="중식"/>
			    </div>
			    <div class="small-unit">치킨
			    	<input type="hidden" name="Chicken" id="Chicken" />
			    	<img src="../../../resources/ProjectPic/간식.jpg" alt="편의점" class="btn" id="치킨"/>
			    </div>
			    <div class="small-unit">피자
			    	<input type="hidden" name="Pizza" id="Pizza"  />
			    	<img src="../../../resources/ProjectPic/간식.jpg" alt="편의점" class="btn" id="피자"/>
			    </div>
			    <div class="small-unit">햄버거
			    	<input type="hidden" name="Burger" id="Burger"  />
			    	<img src="../../../resources/ProjectPic/간식.jpg" alt="편의점" class="btn" id="햄버거"/>
			    </div>
			</form>
		</div>
	</div>
</body>
</html>