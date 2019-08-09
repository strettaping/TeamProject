<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	div{
		border: 1px solid black;		
	}
</style>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$("#loginBtn").click(function(){
			location.href = "<c:url value='/team1/login'></c:url>";
		});
	});

</script>
</head>
<body>
	<div id="header">
		<button type="button" class="btn btn-primary">Primary</button>
	</div>
	
</body>
</html>