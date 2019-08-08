/*
 * programID : patternRegiView.js
 * 내용      : 등록 페이지 js
 * */

$(function(){
	
	var rowCnt = 1;
	console.log(rowCnt);
	
	/* 8자 제한 */
	$("input[name='doWork']").on('keyup', function() {

		console.log('ddd');
		if( $(this).val().length > 8 ) {

			$(this).val( $(this).val().substring(0, 8) );
		}
	});
	
	$.fn.regiFunc = function() {
		
		var flag = true;

		var list = [];
    	
		//console.log('regiFunc');

		$("input[name='doWork']").each(function(index) {
			
			if(!$("input[name='doWork']").eq(index).val()) {
				
				alert(index + '번째 doWork를 입력하세요');								
				
				$("input[name='doWork']").eq(index).focus();
				
				flag = false;
				return false;
			}	
			else {
				
				var workListVo = {};
				
				workListVo.user_id = 'qudejr13';
				workListVo.work    = $("input[name='doWork']").eq(index).val();
				workListVo.content = $("textarea[name='doContent']").eq(index).val();
				workListVo.regiDate = $('#datepicker1').val().split('-').join('');
				
				list.push(workListVo);
			}
		});		

		if(flag) {
			
			/*
			 * 의문
			 * - workList 객체를 만들어서 Vo 객체가 들어있는 Array(list)를 다시 넣어 줘야하는 이유
			 * - pop 조회 및 등록 시 GET을 사용해도 되었는데 메인 등록 시 POST만 먹히는 이유
			 * - stringify으로 String으로 만들어야 하는 이유
			 */ 
			var allData = {};
			
			allData.workList = list;
			alert(JSON.stringify(allData));
			alert(typeof(allData));
			
	    	$.ajax({
	    		
	    		type: "POST"
	    	,	url: "/patternRegi/insertWorkRegi.do"	
	    	,	dataType: "JSON"    	
	    	,	data: JSON.stringify(allData)		
	    	,	contentType: "application/json"
	    	,	success: function() {    			    		
	    			alert('등록 완료');
	    		}
	    	,	error: function(xhr, status, error) { alert('등록 실패'); }
	    	});			
		}
	}	
	
	$.fn.addRowFunc = function() {
				
		//console.log('addRowFunc');	
		var copy = $('.middle div').html();	
				
		console.log(copy);
		
		$('.middle').append(copy);
	}
	
	$.fn.delRowFunc = function() {
		
		//cosole.log('delRowFunc');
		//console.log( $('.middle div:last').html() );
		
		for(i=0; i<=2; i++ ) {
			
			$( $('.middle div:last') ).remove();
		}	
				
	}

	/* 메인 이동 */
	$.fn.mainMove = function() {
		
		location.href = "/patternMain/patternMainView.do";
	}
	
//====================== popUp ======================//
	$.fn.workListSearch = function() {
		var href = $('#layer2');			
		layer_popup(href);
	}
	
    function layer_popup(el) {
    	
    	/* 8자 제한 */
    	$('#popSearch').on('keyup', function() {

    		console.log('ddd');
    		if( $(this).val().length > 8 ) {

    			$(this).val( $(this).val().substring(0, 8) );
    		}
    	});    	

        var el = $(el);        //레이어의 id를 $el 변수에 저장        
        
        $('.dimLayer').fadeIn();
        $('.popLayer').draggable();
        

        var elWidth  = (el.outerWidth()),
            elHeight = (el.outerHeight()),
            docWidth  = $(document).width(),
            docHeight = $(document).height();            

        // 화면의 중앙에 레이어를 띄운다.
        if (elHeight < docHeight || elWidth < docWidth) {
        	
            el.css({
                marginTop: -elHeight /2,
                marginLeft: -elWidth/2
            })
        } else {
        	
            el.css({top: 0, left: 0});
        }

        el.find('#closeBtn').click(function(){

            $('.dimLayer').fadeOut(); // 닫기 버튼을 클릭하면 레이어가 닫힌다.
        });
    }	

    $.fn.popWorkList = function() {
    	
    	var user_id  = 'qudejr13';
    	var work = $('#popSearch').val().trim();	

    	
    	//console.log(user_id);
    	//console.log(work);
    	
    	var workListVo = {};
    	workListVo.user_id = user_id;
    	workListVo.work    = work;
    	
    	$.ajax({
    		
    		type: "GET"
    	,	url: "/patternRegi/getPopWorkList.do"	
    	,	dataType: "JSON"    	
    	,	data: workListVo    			
    	,	contentType: "application/json"
    	,	success: function(obj) {    			    		
    			popWorkListCallBack(obj);
    		}
    	,	error: function(xhr, status, error) { alert('조회 실패'); }
    	});
    }
    
    function popWorkListCallBack(obj) {
    	
    	var list    = obj;
    	var listLen = obj.length;
    	var str     = "";
    	
    	//console.log(list);
    	//console.log(listLen);
    	
    	for( i=0; i<listLen; i++) {
    		
    		str += '<tr>'
    		str += 		'<td>'+list[i].work+'</td>'
    		str += '</tr>'    		
    	} 	

    	if(listLen == 0) {

    		str += '<label>' + '조회된 내용이 없어요' + '</label>';
    	}
    	
    	$('tbody').html(str);
    }
    
    $.fn.popWorkRegi = function() {
    	
    	var user_id  = 'qudejr13';
    	var work = $('#popSearch').val().trim();	    	
    	
    	if(work.length == 0) {

    		alert('리시트를 입력 해주세요');
    		return false;
    	}

    	console.log(user_id);
    	console.log(work);
    	
    	var workListVo = {};
    	workListVo.user_id = user_id;
    	workListVo.work    = work;
    	
    	$.ajax({
    		
    		type: "GET"
    	,	url: "/patternRegi/insertPopWorkRegi.do"	
    	,	dataType: "JSON"    	
    	,	data: workListVo    			
    	,	contentType: "application/json"
    	,	success: function(obj) {    			    		
    			
    			popWorkRegiCallBack(obj);
    		}
    	,	error: function(xhr, status, error) { alert('등록실패'); }
    	});
    }
    
    function popWorkRegiCallBack(obj) {
    	
    	var work = $('#popSearch').val()
    	if(obj > 0) {
    		
    		alert(work + ' 등록완료');    		
    	} 
    	else {
    		
    		alert('이미 존재해요');
    	}
    }
    
        
/********************************************** 이벤트 **********************************************/
	
	/*등록*/	
	$('#regiBtn').click(function(){
		
		$.fn.regiFunc();
	});
	
	/*row 추가*/
	$('#addRowBtn').click(function(){
		
		rowCnt ++;
		//console.log(rowCnt);
		$.fn.addRowFunc();
	});
	
	/*row 제거*/
	$('#delRowBtn').click(function(){
		
		if(rowCnt > 1) {
			rowCnt--;	
			//console.log(rowCnt);
			$.fn.delRowFunc();
		}
	});
	
	/* 메인 이동 */
	$('#mainMove').click(function() {
		
		$.fn.mainMove();
	});
//========================== popUp ===========================//	
	
	/*popUp Open*/
	$('#workListSearch').click(function(){
		
		$.fn.workListSearch();
	});		
	
	/*pop 리스트 조회*/
	$('#popSearchBtn').click(function(){
		
		$.fn.popWorkList();
	});			

	/*pop 리스트 등록*/
	$('#popRegiBtn').click(function(){
		
		$.fn.popWorkRegi();
	});			

	/*popUp tr 더블클릭 시 메인으로 값 전달.*/
	/*일단 보류*/
/*	$('#popTable table tr').dblclick(function(){			
		    					
		var td = $(this).children().text();
    	//console.log(td);    	 
    	$("input[name='doWork']").val(td);     
    	$('.dimLayer').fadeOut();
	});	*/		
});	
	
