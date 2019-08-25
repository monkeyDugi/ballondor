<!-- 
	* programID : login.jsp
	* 내용      : login 화면 
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

<link rel="stylesheet" href="/resources/css/member/login.css">  
<script src="<c:url value="/resources/js/member/login.js" />"></script> 

<title>로그인</title>
</head>
<body>
<div class="topBar" id="mainMove">
	<label class="topLabel">
		MyPattern
	</label>
</div>

<div class="header">					
	<button id="signUpBtn" class="signBtn">회원가입</button> 					
</div>			
	
<div class="wrap">	
	<div class="middle">
	<form name="form1" method="post">	
		<div class="content">	
			<input type="text" id="userId" name="userId" placeholder="아이디"/>
			<input type="password" id="userPw" name="userPw" placeholder="비밀번호"/>
		</div>													
	</form>	
	<c:if test="${msg == 'failure'}">
		<div class="msg"> 
			<label class="fail">아이디 또는 비밀번호가 일치하지 않습니다.</label>
		</div> 
	</c:if>			
	<c:if test="${msg == null}">
		<div class="msg"> 
			<label class="nomal">로그인을 해주세요!</label>
		</div> 
	</c:if>			
	</div>
	<div class="footer">
		<div class="loginBtnWrap">			
			<button id="loginBtn" class="basicBtn">로그인</button> 			
		</div>
	</div>			
</div>
</body>
</html>