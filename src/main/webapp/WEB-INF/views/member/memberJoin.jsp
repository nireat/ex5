<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<title>Insert title here</title>
<script type="text/javascript">
	
	$(function() {
		
		$("#teacher-frm").click(function() {
			$(".student").attr("style", "display:none");
			$(".teacher").removeAttr("style");
			
		});
		$("#student-frm").click(function() {
			$(".teacher").attr("style", "display:none");
			$(".student").removeAttr("style");
		});
		
		$("#btn").click(function() {
				var path='';
			$(".g").each(function() {
				if($(this).prop("checked")){
					path=$(this).val()+"Join";
				}
			});
			
			$("#frm").attr("action", path);
			$("#frm").submit();
		});
	});
	
</script>
</head>
<body>

	<form action="" id="frm" method="post" enctype="multipart/form-data">
		<div>
			STUDENT: <input type="radio" class="g" checked="checked" name="grade" value="student" id="student-frm">
			TEACHER: <input type="radio" class="g" name="grade" value="teacher" id="teacher-frm">
		</div>
		<!-- 공통 입력 사항 -->
		<div>
			<p>ID: <input type="text" name="id"></p>
			<p>PW: <input type="text" name="pw"></p>
			<p>NAME: <input type="text" name="name"></p>
			<p>AGE: <input type="number" name="age"></p>
			<p>FILENAME: <input type="file" name="f1"></p>
			
		</div>
		<!-- student 전용 -->
		<div class="student">
			<p>SID: <input type="text" name="sid"></p>
			<p>PHONE: <input type="text" name="phone"></p>
			<p>TID: <input type="text" name="tid"></p>
		</div>
		<!-- teacher 전용 -->
		<div class="teacher" style="display: none;">
			<p>TID: <input type="text" name="tid"></p>
			<p>SUBJECT: <input type="text" name="subject"></p>
			<p>HIREDATE: <input type="date" name="hiredate"></p>
		</div>

			<input type="button" value="join" id="btn">
	</form>

</body>
</html>