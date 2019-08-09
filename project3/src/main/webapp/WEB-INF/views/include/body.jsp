<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<style type="text/css">
	#container{
		align:center;
	}
	
	#upLine{
		height: 300px;
	}
	
	#underLine{
		height: 300px;
	}
	
	img{
		width: 300px;
		height: 300px;
	}
	
	#kfood{
		
	}
	
	.category{
		width: 300px;
		height: 300px;
	}
</style>
<title></title>
</head>
<body>
	<form name="frm">
		<div id="containder">
			<div id="upLine">
				<div id="kfood" class="category">
					<img src="../../../resources/ProjectPic/한식.jpg" alt="한식" />
					<input type="hidden" name="category" value="한식" />
				</div>
				<div id="jfood" class="category">
					<img src="../../../resources/ProjectPic/일식.jpg" alt="일식" />
					<input type="hidden" name="category" value="일식" />
				</div>
				<div id="cfood" class="category">
					<img src="../../../resources/ProjectPic/중식.jpg" alt="중식" />
					<input type="hidden" name="category" value="중식" />
				</div>
			</div>
			<div id="underLine">
				<div id="yfood" class="category">
					<img src="../../../resources/ProjectPic/양식.jpg" alt="양식" />
					<input type="hidden" name="category" value="양식" />
				</div>
				<div id="bfood" class="category">
					<img src="../../../resources/ProjectPic/분식.jpg" alt="분식" />
					<input type="hidden" name="category" value="분식" />
				</div>
				<div id="dfood" class="category">
					<img src="../../../resources/ProjectPic/간식.jpg" alt="간식" />
					<input type="hidden" name="category" value="간식" />
				</div>
			</div>
		</div>
	</form>
</body>
</html>