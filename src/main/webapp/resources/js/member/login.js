/*
 *  programID : login.js
 *  내용      : 로그인 페이지 js 
 */


/* 나중에 session 생각 */
$(function(){
	
	/* 회원가입 페이지 이동 */
	$.fn.signUpFunc = function() {
		    
    	/*location.href = "/patternRegi/patternRegiView.do";	*/
	};
	
	/* 로그인 */
	$.fn.loginFunc = function() {
		
		var userId = $('#userId').val();		
		var userPw = $('#userPw').val();	
				
		if(userId == '' || userPw == '') {
			
			if(userId == '' && userPw == '') {
				
				alert('아이디와 비밀번호를 입력하세요');
				$('#userId').focus();						
			} else if(userId == '') {

				alert('아이디를 입력하세요');
				$('#userId').focus();
							
			} else if(userPw == '') {
				
				alert('비밀번호를 입력하세요');
				$('#userPw').focus();
				
			}
			
			return;
		}
		
		document.form1.action="/member/loginCheck.do";
		document.form1.submit();
	};

/**************************************** 이벤트 **************************************************/
	/* 회원가입 페이지 이동 */
	$('#signUpBtn').click(function() {
		
		$.fn.signUpFunc();
	});
	
	/* 로그인 */
	$('#loginBtn').click(function() {
		
		$.fn.loginFunc();
	});
});	





