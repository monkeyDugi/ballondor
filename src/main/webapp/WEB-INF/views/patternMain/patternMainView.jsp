<!-- 
	* programID : patternMainView.jsp
	* 내용      : 메인 페이지 화면 
 -->

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link href="https://fonts.googleapis.com/css?family=Oswald&display=swap" rel="stylesheet">

<link rel="stylesheet" href="/resources/css/patternMain/patternMain.css">  
<script src="<c:url value="/resources/js/patternMain/patternMain.js" />"></script> 

<title>메인</title>
</head>
<body>
<div class="topBar">
	<label class="topLabel">
		MyPattern
	</label>
</div>

<div class="header">			
	<!-- <button id="signInBtn" class="signBtn">로그인</button> --> 
	<button id="signOutBtn" class="signBtn">로그아웃</button>  
	<button id="signUpBtn" class="signBtn">회원가입</button> 					
</div>			

<div class="wrap">	
	<div class="middle">
		<div class="content">	
			<!-- <div class="doWorkWrap"> -->
				<label class="descriptLabel">
					<p>내가 무엇을 </p>
					<p>많이 하는지,</p> 
					<p>적게 하는지,</p> 
					<p>궁금하지 않으세요?</p>
				</label>	
			<!-- </div> -->
		</div>									
	</div>
	<div class="footer">
		<div class="regiAndSearchBtn">			
			<button id="regiBtn" class="basicBtn">등록하기</button> 
			<button id="searchBtn" class="basicBtn">조회하기</button> 
		</div>
	</div>			
</div>
</body>
</html>