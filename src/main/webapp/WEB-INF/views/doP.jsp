<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>doP.jsp</h3>
<script>
//'${msg}'에 ok문자가 들어온다 -> msg 변수에 문자가 저장됨
// 문자가 아니면 ''작은따옴표 없이 사용
	let msg = '${msg}';
	alert(msg);
</script>
</body>
</html>