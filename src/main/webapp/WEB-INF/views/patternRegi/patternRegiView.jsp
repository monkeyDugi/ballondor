<!-- 
	* programID : patternRegi.jsp
	* 내용      : 등록 페이지 화면 
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

<link rel="stylesheet" href="/resources/css/patternRegi/patternRegi.css">  
<script src="<c:url value="/resources/js/com/common.js" />"></script> 
<script src="<c:url value="/resources/js/patternRegi/patternRegi.js" />"></script> 

<title>패턴 등록</title>
</head>
<body>
<div class="topBar">
	<label class="topLabel">
		MyPattern
	</label>
</div>

<!-- popUp Start-->
<div class="dimLayer">
    <div class="dimBg"></div>
    <div id="layer2" class="popLayer">
    	<div class="popTop">
    		<div class="popSearchWrap">	
    			<input type="text" id="popSearch" placeholder="리스트를 조회 하세요"/>
    		</div>	
    		<div class="popSearchBtnWrap">
    			<button id="popSearchBtn" class="basicBtn">조회</button>    			
    			<button id="popRegiBtn" class="basicBtn">등록</button> 
    		</div>	
    	</div>
        <div class="popContainer">
            <div class="popConts">
                <!--content //-->
                <div class="popTable" id="popTable">
	                <table>
	                	<tbody>
	                	</tbody>
	                </table>
				</div>
                <div class="closeBtnWrap">
                    <button id="closeBtn" class="basicBtn">닫기</button>
                </div>
                <!--// content-->
            </div>
        </div>
    </div>
</div>
<!-- popUp End-->

<div class="wrap">	
	<div class="header">			
		<div class="date">
			<label>기간 : </label>
			<input type="text" id="datepicker" readonly="readonly"/>						
		</div>		
	
		<div class="workListWrap">
			<div class="labelWrap">
				<label>오늘 한 일 리스트를 검색하세요</label>
			</div>
			<div class="SRBtnWrap">				
				<button id="workListSearch" class="basicBtn">검색</button>				
			</div>
		</div>									
				
		<div class="rowCtrWrap">			
			<div class="labelWrap">
				<label>오늘 한 일을 쓰세요 </label>
			</div>
			<div class="rowBtnWrap">				
				<button id="addRowBtn" class="rowBtn">+</button>
				<button id="delRowBtn" class="rowBtn">-</button>			
			</div>
		</div>				
	</div>			
	
	<div class="middle">
		<div>	
			<div class="content">	
				<div class="doWorkWrap">
					<input type="text" name="doWork" class="doWork" placeholder="오늘 한 일을 입력하세요"/>
				</div>
				<div class="doContentWrap">	
					<textarea name="doContent" class="doContent" placeholder="상세내용을 최대 100자 내로 입력하세요"></textarea>
				</div>	
			</div>
		</div>									
	</div>
	<div class="footer">
		<div class="regiAndUpt">
			<button id="regiBtn" class="basicBtn">등록</button>
			<!-- <button id="regiUpt" class="basicBtn">수정</button> -->
		</div>
	</div>			
</div>
</body>
</html>