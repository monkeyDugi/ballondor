/*
 *  programID : patternMain.js
 *  내용      : 메인 페이지 js 
 */

$(function(){
	
	/* 등록 페이지 이동 */
	$.fn.regiPageFunc = function() {
		    
    	location.href = "/patternRegi/patternRegiView.do";	
	};
	
	/* 조회 페이지 이동 */
	$.fn.searchPageFunc = function() {
		
		location.href = "/patternSearch/patternSearchView.do";						    		
	};
	
	/* 로그인 페이지 이동 */
	$.fn.signInFunc = function() {
		
		location.href = "/member/login.do";						    		
	};
	
	/* 로그아웃 */
	$.fn.signOutFunc = function() {
		
		location.href = "/member/logout.do";						    		
	};
	
	/* 회원가입 페이지 이동 */
	$.fn.signUpFunc = function() {
		
		location.href = "/member/signUp.do";						    		
	};

/**************************************** 이벤트 **************************************************/
	/* 등록 페이지 이동 */
	$('#regiBtn').click(function() {
		
		$.fn.regiPageFunc();
	});
	
	/* 조회 페이지 이동 */
	$('#searchBtn').click(function() {
		
		$.fn.searchPageFunc();
	});
	
	/* 로그인 페이지 이동 */
	$('#signInBtn').click(function() {
		
		$.fn.signInFunc();
	});
	
	/* 로그아웃 */
	$('#signOutBtn').click(function() {
		
		$.fn.signOutFunc();
	});
	
	/* 회원가입 페이지 이동 */
	$('#signUpBtn').click(function() {
		
		$.fn.signUpFunc();
	});
});	





