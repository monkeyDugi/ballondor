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
	// 최초 로드 시 포커스
	$('#userId').focus();	
	
	/* 로그인 페이지 이동 */
	$.fn.loginFunc = function() {
		    
    	location.href = "/member/login.do";	
	};
	
	/* 아이디 15자 제한 */
	$("#userId").on('keyup', function() {
		
		if( $(this).val().length > 15 || $(this).val().length < 4) {

			$(".nomal").text('4자리 이상 ~ 15자리 이하로 입력해주세요');
			idChk = false;
		}
		else {
			
			$(".nomal").text('');
			idChk = true;
		}
	});
	
	/* 이름 15자 제한 */
	$("#userName").on('keyup', function() {
		
		if( $(this).val().length > 15 || $(this).val().length < 1 ) {
			
			$(".nmNomal").text('1자리 이상 ~ 15자리 이하로 입력해주세요');
			nmChk = false;
		}
		else {
			
			$(".nmNomal").text('');
			nmChk = true;
		}
	});	
	
	/* 비밀번호 15자 제한 */
	$("#userPw").on('keyup', function() {
		
		if( $(this).val().length > 15 || $(this).val().length < 8 ) {
			
			$(".pwNomal").text('8자리 이상 ~ 15자리 이하로 입력해주세요');
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
	
	/* 로그인 */
	$.fn.signUpFunc = function() {
		
/*		var userId = $('#userId').val();		
		var userName = $('#userName').val();				
		var userPw = $('#userPw').val();				
		var userPwCheck = $('#userPwCheck').val();				
							
		if(userId == '') {
			
			alert('아이디를 입력 해주세요');
			$('#userId').focus();	
			return;
		} else if(userName == '') {

			alert('이름을 입력하세요');
			$('#userId').focus();
			return;
		} else if(userPw == '') {
			
			alert('비밀번호를 입력하세요');
			$('#userPw').focus();
			return;
		} else if(userPw != userPwCheck) {
			
			alert('비밀번호가 일치하지 않습니다.');
			$('#userPwCheck').focus();
			return;
		}*/				
		
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





