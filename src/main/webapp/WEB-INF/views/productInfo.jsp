<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>상품소개</h3>
<!--  model.addAttribute("product", product); -->
<!-- jsp에서 사용하기 위해 지정한 겍체명.getter메서드 -->
<!-- getter 메서드가 동작하게 해야함. getter메서드의 이름에서 get을 떼고 앞자리를 소문자로 바꾼다 => 필드 이름과 동일 -->
<p>상품명 : ${pdt.name }</p>
<p>가격 : ${pdt.price }</p>
</body>
</html>