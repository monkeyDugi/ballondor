<!-- 
	* programID : signUp.jsp
	* 내용      : 회원가입 화면 
 -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link href="https://fonts.googleapis.com/css?family=Oswald&display=swap" rel="stylesheet">

<link rel="stylesheet" href="/resources/css/member/signUp.css">  
<script src="<c:url value="/resources/js/member/signUp.js" />"></script> 

<title>회원가입</title>
</head>
<body>
<div class="topBar" id="mainMove">
	<label class="topLabel">
		MyPattern
	</label>
</div>

<div class="header">					
	<button id="loginBtn" class="signBtn">로그인</button> 					
</div>			
	
<div class="wrap">	
	<div class="middle">
	<form name="form1" method="post">	
		<div class="content">	
			<input type="text" id="userId" name="userId" placeholder="아이디"/> 	
			<div class="msg"> 
				<label class="nomal">${msg}</label>
			</div> 		
			<input type="text" id="userName" name="userName" placeholder="이름"/>
			<div class="msg"> 
				<label class="nmNomal"></label>
			</div>
			<input type="password" id="userPw" name="userPw" placeholder="비밀번호"/>
			<div class="msg"> 
				<label class="pwNomal"></label>
			</div>
	</form>		
			<input type="password" id="userPwCheck" placeholder="비밀번호"/>
			<div class="msg"> 
				<label class="pwChkNomal"></label>
			</div>
		</div>													
	</div>
	<div class="footer">
		<div class="signUpBtnWrap">			
			<button id="signUpBtn" class="basicBtn">가입하기</button> 			
		</div>
	</div>			
</div>
</body>
</html>