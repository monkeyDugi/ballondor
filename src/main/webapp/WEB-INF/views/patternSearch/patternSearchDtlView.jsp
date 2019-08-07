<!-- 
	* programID : patternSearchDtl.jsp
	* 내용      : 상세보기 페이지 화면 
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

<link rel="stylesheet" href="/resources/css/patternSearch/patternSearchDtl.css">  
<script src="<c:url value="/resources/js/patternSearch/patternSearchDtl.js" />"></script> 

<title>상세 보기</title>
</head>
<body>
<div class="topBar">
	<label class="topLabel">
		MyPattern
	</label>
</div>

<div class="wrap">	
	<div class="header">			
		<div class="date">
			<label>2019-08-07</label>					
		</div>					
	</div>			
	
	<div class="middle">
		<div class="content">	
			<div class="doWorkWrap">
				<label>한 일</label>	
			</div>
			<div class="doContentWrap">	
				<textarea name="doContent" class="doContent" placeholder="상세내용을 최대 100자 내로 입력하세요"></textarea>
			</div>	
		</div>									
	</div>
	<div class="footer">
		<div class="upt">			
			<button id="uptBtn" class="basicBtn">수정</button> 
			<button id="closBtn" class="basicBtn">닫기</button> 
		</div>
	</div>			
</div>
</body>
</html>