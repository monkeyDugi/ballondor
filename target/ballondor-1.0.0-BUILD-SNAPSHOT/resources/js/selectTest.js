$(function(){
	
	alert('js 호출 성공');
	$.fn.getMemberList();
});	

$.fn.getMemberList = function() {
	
	alert('js 메서드 호출 성공');
	$.ajax({
		
		type:"GET"
	,	url: "/member/getMemberList.do"
	,	dataType: "JSON"	
	,	success: function(obj) {
		
			$.fn.getMemberListCallback(obj);
		}
	,	error: function(xhr, status, error) {
		
		alert("js 실패");
	}
	});
}
	
$.fn.getMemberListCallback = function(obj) {
	
	alert('js callback 메서드 호출 성공');
	var list = obj;
	var listLen = obj.length;
	
	console.log(list);
	console.log(listLen);
}


	
