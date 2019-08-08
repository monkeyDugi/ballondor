/*
 *  programID : patternSearchDtl.js
 *  내용      : 상세보기 페이지  
 */

$(function(){
	
	/* 메인 이동 */
	$.fn.mainMove = function() {
		
		location.href = "/patternMain/patternMainView.do";
	}
	
/******************************************** 이벤트 *************************************************/	
	/* 메인 이동 */
	$('#mainMove').click(function() {
		
		$.fn.mainMove();
	});	
});	





