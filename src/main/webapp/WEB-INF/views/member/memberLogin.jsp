<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<script type="text/javascript">
$(function () {
	
$("#btn").click(function() {
	var path='';
$(".g").each(function() {
	if($(this).prop("checked")){
		path=$(this).val()+"Login";
	}
});

$("#frm").attr("action", path);
$("#frm").submit();
});
});
</script>
<title>Insert title here</title>
</head>
<body>

	<form action="loginMember" method="post" id="frm">
		<p>ID: <input type="text" name="id"></p>
		<p>PW: <input type="password" name="pw"></p>
		<p>STUDENT: <input type="radio" name="grade" class="g" value="student" checked="checked">
		TEACHER: <input type="radio" name="grade" class="g" value="teacher"></p>
		<input type="button" id="btn" value="LOGIN">
	</form>

</body>
</html>