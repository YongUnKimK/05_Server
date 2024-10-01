

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>입력되어 전달된 값들</title>
</head>
<body>
	
	
	
	<h1>회원 가입 결과 페이지 입니다</h1>
	<h3>입력되어 전달된 값들</h3>
	<ul>
	<li>
	 ID : <%= request.getParameter("inputId1") %>
	</li>
	<li>
	 PW : <%= request.getParameter("inputPw1") %>
	</li>
	<li>
	 확인 : <%= request.getParameter("pwCheck1") %>
	</li>
	<li>
	 이름 : <%= request.getParameter("inputName1") %>
	</li>
	<li>
	 나이 : <%= request.getParameter("inputAge1") %>
	</li>
	</ul>
	
	<c:if test="${param.inputPw1 == param.pwCheck1}"> 
	 <h1 style="color: brown;">회원가입 성공!</h1>
	</c:if>
	
	<c:if test="${param.inputPw1 != param.pwCheck1 }"> 
	 <h1 style="color:red;"> 비밀번호 불일치</h1>
	</c:if>>
</body>
</html>