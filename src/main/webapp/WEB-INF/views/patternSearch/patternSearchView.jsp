<!-- 
	* programID : patternSearchView.jsp
	* 내용      : 조회 화면 
 -->

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>       
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<script src="https://code.jquery.com/jquery-1.12.4.js"></script>
<script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.4.0/Chart.min.js"></script>
<link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link href="https://fonts.googleapis.com/css?family=Oswald&display=swap" rel="stylesheet">

<link rel="stylesheet" href="/resources/css/patternSearch/patternSearch.css">  
<script src="<c:url value="/resources/js/patternSearch/patternSearch.js" />"></script>
<script src="<c:url value="/resources/js/com/common.js" />"></script>  

<title>조회</title>
</head>
<body>
<!-- 로그인 정보(userId) -->
<input id="userId" type="hidden" value="${sessionScope.userId}"/>

<div class="topBar" id="mainMove">
	<label class="topLabel">
		MyPattern
	</label>
</div>

<!-- 달력 -->
<div class="date">
	<label>기간 : </label>
	<input type="text" id="datepicker1" class="datepicker" readonly="readonly"/> ~						
	<input type="text" id="datepicker2" class="datepicker" readonly="readonly"/>	
	<!-- 의문 float: right --> 
	<div class="searchBtnWrap">
		<button id="searchBtn" class="basicBtn">조회</button>	
	</div>						
</div>

<!-- 그래프 -->
<div class="chart">
    <canvas id="myChart"></canvas>     
</div>

<div class="loginHeader">
	<label>${sessionScope.userName}님 환영합니다.</label> 
	<button id="signOutBtn" class="signBtn">로그아웃</button>  
</div>

<!-- 목록 -->
<div class="wrap"></div>
</body>
</html>