/*
 *  programID : patternSearchDtl.js
 *  내용      : 상세보기 페이지  
 */

$(function(){
	
	// 조회화면에서 클릭한 내용 idx
	var idx   = $('#idx').val();
	var sessionUserId = $('#userId').val();
	
	/* 100자 제한 */
	$("#doContent").on('keyup', function() {
		
		if( $(this).val().length > 100 ) {

			$(this).val( $(this).val().substring(0, 100) );
		}
	});	
	
	//console.log(idx);
			
	var loadData = {};
	
	loadData.idx  = idx;
	
	// 최초 로드 시 상세내용 조회
	$.ajax({
		
		type: "GET"
	,	url: "/patternSearch/selectDtlWorkSearch.do"	
	,	dataType: "JSON"    	    	
	,	data: loadData	
	,	contentType: "application/json"
	,	success: function(obj) {    			    		
			console.log(obj);
			dtlListFunc(obj);
		}
	,	error: function(xhr, status, error) { alert('실패'); }
	});	
		
	/* 상세내용 조회 */
	function dtlListFunc(obj) {
		
		var regi_date = obj[0].regi_date;
		var work = obj[0].work;
		var content = obj[0].content;
		
		console.log('regi_date : ' + regi_date);
		console.log('work : ' + work);
		console.log('content : ' + content);
		
		$("#date").text(regi_date);
		$("#doWork").text(work);
		$("#doContent").val(content);
	}
	
	/* 메인 이동 */
	$.fn.mainMove = function() {
		
		location.href = "/patternMain/patternMainView.do";
	}
	
	/* 로그아웃 */
	$.fn.signOutFunc = function() {
		
		location.href = "/member/logout.do";						    		
	};
	
	/* 수정하기 */
	$.fn.updateFunc = function() {
		
		var content = $("#doContent").val();
		
		var data = {};
		
		data.idx = idx;
		data.content = content;
		data.user_id = sessionUserId;
		
		$.ajax({
			
			type: "GET"
		,	url: "/patternSearch/updateDtl.do"	
		,	dataType: "JSON"    	    	
		,	data: data	
		,	contentType: "application/json"
		,	success: function() {    			    		
				// 조회화면으로 이동				
				location.href = "/patternSearch/patternSearchView.do";
			}
		,	error: function(xhr, status, error) { alert('실패'); }
		});									    	
	};
	
	/* 닫기 클릭 */
	/* 조회 화면으로 이동 */
	$.fn.closeFunc = function() {
		
		location.href = "/patternSearch/patternSearchView.do";								    	
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
	
	/* 수정하기 */
	$('#uptBtn').click(function() {
		
		$.fn.updateFunc();
	});
	
	/* 닫기버튼 클릭 */
	$('#closeBtn').click(function() {
		
		$.fn.closeFunc();
	});	
	
});	





