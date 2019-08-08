/*
 *  programID : patternMain.js
 *  내용      : 메인 페이지 js 
 */


/* 나중에 session 생각 */
$(function(){
	
	/* 등록 페이지 이동 */
	$.fn.regiPage = function() {
		    
    	location.href = "/patternRegi/patternRegiView.do";	
	};
	
	/* 조회 페이지 이동 */
	$.fn.searchPage = function() {
		
		location.href = "/patternSearch/patternSearchView.do";						    		
	};

/**************************************** 이벤트 **************************************************/
	/* 등록 페이지 이동 */
	$('#regiBtn').click(function() {
		
		$.fn.regiPage();
	});
	
	/* 조회 페이지 이동 */
	$('#searchBtn').click(function() {
		
		$.fn.searchPage();
	});
});	





