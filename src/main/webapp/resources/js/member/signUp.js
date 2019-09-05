/*
 *  programID : login.js
 *  내용      : 로그인 페이지 js 
 */


/* 나중에 session 생각 */
$(function(){
	
	var idChk = false;
	var nmChk = false;
	var pwChk = false;
	var pwChkChk = false;

	// 회원가입 유효성 체크 정규식
    var numberPattern = /[0-9]/;          		   // 숫자 
    var lowuppPattern = /[a-zA-Z]/;       		   // 대소문자
    var spcialPattern = /[~!@\#$%<>^&*]/; 		   // 특수문자    
    var utf8Pattern   = /[가-힣]/;        		   // 한글    
    var spacePattern  = /[\s]/;           		   // 공백       
    var namePattern   = /^[A-Za-z가-힣]{1,15}$/;  // 이름 체크 정규식
    var idPattern     = /^[A-Za-z0-9]{4,15}$/;    // 아이디 체크 정규식
    
	// 최초 로드 시 포커스
	$('#userId').focus();	
	
	/* 로그인 페이지 이동 */
	$.fn.loginFunc = function() {
		    
    	location.href = "/member/login.do";	
	};
	
	/* 아이디 15자 제한 */
	$("#userId").on('keyup', function() {
		
		if( !idPattern.test($(this).val()) || spacePattern.test($(this).val()) ) {

			$(".nomal").text('대소문자, 숫자 4자리 이상 ~ 15자리 이하로 입력해주세요');
			idChk = false;
		}
		else {
			
			$(".nomal").text('');
			idChk = true;
		}
	});
	
	/* 이름 15자 제한 */
	$("#userName").on('keyup', function() {
		
		if( !namePattern.test($(this).val()) || spacePattern.test($(this).val()) ) {
			
			$(".nmNomal").text('한글, 대소문자 1자리 이상 ~ 15자리 이하로 입력해주세요');
			nmChk = false;
		}
		else {
			
			$(".nmNomal").text('');
			nmChk = true;
		}
	});	
	
	/* 비밀번호 15자 제한 */
	$("#userPw").on('keyup', function() {
		
		if( $(this).val().length > 15 || $(this).val().length < 8 || !numberPattern.test($(this).val()) || !lowuppPattern.test($(this).val()) 
			|| !spcialPattern.test($(this).val()) || spacePattern.test($(this).val()) ) {
			
			$(".pwNomal").text('대소문자+숫자+특수문자 8자리 이상 ~ 15자리 이하로 입력해주세요');
			pwChk = false;
		} 
		else {
			
			$(".pwNomal").text('');
			pwChk = true;
		}
	});
	
/*	 비밀번호 체크 15자 제한 */
	$("#userPwCheck").on('keyup', function() {
		
		if( $(this).val() != $("#userPw").val() ) {
			
			$(".pwChkNomal").text('비밀번호가 일치하지 않아요');
			pwChkChk = false;
		}
		else {
						
			$(".pwChkNomal").text('');
			pwChkChk = true;
		}
	});	
	
	/* 가입하기 */
	$.fn.signUpFunc = function() {			
		
		if(!idChk || !nmChk || !pwChk || !pwChkChk) {
			
			alert('입력항목을 확인해주세요');
			return;
		}
		
		document.form1.action="/member/signUpCheck.do";
		document.form1.submit();
	};

	/* 메인 이동 */
	$.fn.mainMove = function() {
		
		location.href = "/patternMain/patternMainView.do";
	}	
/**************************************** 이벤트 **************************************************/
	/* 가입하기 */
	$('#signUpBtn').click(function() {
		
		$.fn.signUpFunc();
	});
	
	/* 로그인 페이지 이동*/
	$('#loginBtn').click(function() {
		
		$.fn.loginFunc();
	});
	
	/* 메인 이동 */
	$('#mainMove').click(function() {
		
		$.fn.mainMove();
	});	
});	





