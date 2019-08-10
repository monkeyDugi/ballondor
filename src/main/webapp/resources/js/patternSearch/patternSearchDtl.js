/*
 *  programID : patternSearchDtl.js
 *  내용      : 상세보기 페이지  
 */

$(function(){
	
	/* 메인 이동 */
	$.fn.mainMove = function() {
		
		location.href = "/patternMain/patternMainView.do";
	}
	
	/* 로그아웃 */
	$.fn.signOutFunc = function() {
		
		location.href = "/member/logout.do";						    		
	};	
/******************************************** 이벤트 *************************************************/	
	/* 메인 이동 */
	$('#mainMove').click(function() {
		
		$.fn.mainMove();
	});	
	
	/* 로그아웃 */
	$('#signOutBtn').click(function() {
		
		$.fn.signOutFunc();
	});	
});	





