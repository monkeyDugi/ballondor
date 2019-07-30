$(function(){
	
	$.fn.singUpFunc = function() {
		
		if(!$('#userNm').val()) {
			
			alert('이름을 입력하세요');
			$('#userNm').focus();
			return;
		}
		else if(!$('#userId').val()) {
			
			alert('아이디 입력하세요');
			$('#userId').focus();
			return;
		}
		else if(!$('#userPw').val()) {
			
			alert('비밀번호를 입력하세요');
			$('#userPw').focus();
			return;
		}
		else if(!$('#userCheckPw').val()) {
			
			alert('비밀번호를 입력하세요');
			$('#userCheckPw').focus();
			return;		
		}
		
		/* 비밀번호 체크 */
		if($('#userPw').val() != $('#userCheckPw').val()) {
			
			alert('비밀번호가 일치하지 않습니다.');
			
			$('#userPw').val('');
			$('#userCheckPw').val('');
			
			$('#userPw').focus();
			return;
		}		
		
		/* 비밀번호 8자리 체크 */
		if($('#userPw').val().length > 8 || $('#userPw').val().length < 4) {
			
			alert('비밀번호는 4자리 이상 8자리 이하로 만들어 주세요.');
			
			$('#userPw').val('');
			$('#userCheckPw').val('');
			
			$('#userPw').focus();
			return;
		}	
		
		alert('회원가입 완료');
	}
	
	// signUpFunc() 호출
	$('#signUp').click(function() {
		
		$.fn.signUpFunc();
	});
});