/*
 * programID : common.js
 * 내용      : 공통 js
 * */

	$.datepicker.setDefaults({
	    dateFormat: 'yy-mm-dd',
	    prevText: '이전 달',
	    nextText: '다음 달',
	    monthNames: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월'],
	    monthNamesShort: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월'],
	    dayNames: ['일', '월', '화', '수', '목', '금', '토'],
	    dayNamesShort: ['일', '월', '화', '수', '목', '금', '토'],
	    dayNamesMin: ['일', '월', '화', '수', '목', '금', '토'],
	    showMonthAfterYear: true,
	    yearSuffix: '년'
	});

$(function(){
	
	$("#datepicker1").datepicker({ });	
	$('#datepicker1').datepicker('setDate', 'today');
	
	$("#datepicker2").datepicker({ });	
	$('#datepicker2').datepicker('setDate', 'today');
	
/*	$(document).on('keyup', '.onlyNum', function(){
				
		$(this).val($(this).val().replace(/[^0-9]/gi,""));
	});*/
});