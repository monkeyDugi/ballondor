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
<script src="<c:url value="/resources/js/com/common.js" />"></script> 
<script src="<c:url value="/resources/js/patternSearch/patternSearch.js" />"></script> 

<title>패턴 조회</title>
</head>
<body>
<div class="topBar">
	<label class="topLabel">
		MyPattern
	</label>
</div>

<div class="char">
    <canvas id="myChart"></canvas>
</div>

</body>
</html>