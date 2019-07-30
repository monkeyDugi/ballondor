<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>회원가입</title>
<!-- <link rel="stylesheet" href="css/signUp.css"> -->
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<!-- <script src="js/selectTest.js"></script> -->
<script src="<c:url value="/resources/js/selectTest.js" />"></script>

</head>         
<body>
<div class="container">
	<h1>회원가입</h1>
	
	<div class="label">이름</div>
	<div class="form">
		<input type="text" id="userNm" placeholder="이름을 입력해주세요"/>	
	</div>
	
	<div class="label">아이디</div>
	<div class="form">
		<input type="text" id="userId" placeholder="아이디를 입력해주세요"/>	
	</div>	
	
	<div class="label">비밀번호</div>
	<div class="form">
		<input type="password" id="userPw" placeholder="비밀번호를 입력해주세요"/>	
	</div>
	
	<div class="label">비밀번호확인</div>
	<div class="form">
		<input type="password" id="userCheckPw" placeholder="비밀번호를 입력해주세요"/>	
	</div>	
	
	<button id="signUp">가입하기</button>
</div>
</body>
</html>