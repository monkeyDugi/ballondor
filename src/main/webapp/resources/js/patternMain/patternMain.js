/*
 *  programID : patternMain.js
 *  내용      : 메인 페이지 js 
 */


/* 나중에 session 생각 */
$(function(){
	
	/*페이지 이동은 ajax로 하는게 아니다. ajax는 데이터 송수신*/
	
	
/*	$.fn.regiPage = function() {
		    	
    	$.ajax({
    		
    		type: "GET"
    	,	url: "/patternSearch/selectBarWorkSearch.do"	
    	,	dataType: "JSON"    	    	
    	,	data: data	
    	,	contentType: "application/json"
    	,	success: function(obj) { }
    	,	error: function(xhr, status, error) { alert('실패'); }
    	});	    	
	};
	
	$.fn.searchPage = function() {
		
		$.ajax({
			
			type: "GET"
		,	url: "/patternSearch/patternSearchView.do"						    		
		,	contentType: "application/json"
		,	success: function() { }
		,	error: function(xhr, status, error) { alert('실패'); }
		});	    	
	};
*/
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





