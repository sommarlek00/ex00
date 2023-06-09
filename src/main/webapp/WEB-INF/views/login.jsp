<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>로그인 폼</h3>
<form method="get" action="loginOK"> <!-- action="스프링의 매핑주소" -->
<!-- setter 사용. set 떼고 앞글자 소문자로 바꿔줌 => 필드 이름과 동일  -->
	아이디 : <input type="text" name="u_id"><br>
	비밀번호 : <input type="password" name="u_pw"><br>
	<input type="submit" value="로그인">
</form>
</body>
</html>