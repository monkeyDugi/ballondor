/*
 *  programID : patternSearch.js
 *  내용      : 등록된 패턴 그래프로 표시 및 목록 조회 
 */

$(function(){
	
	// 초기화면 그래프 내용 없게.
	chartFunc('');
	
	$.fn.listSearch = function() {
		
		var user_id   = 'qudejr13';
		var from_date = $('#datepicker1').val().split('-').join('');
		var to_date   = $('#datepicker2').val().split('-').join('');
		
/*		alert('date1 : ' + from_date); 
		alert('date2 : ' + to_date); */
		
		var data = {};
		
		data.user_id  = user_id;
		data.from_date = from_date;
		data.to_date = to_date;
		
		/* 전체목록 select */ 
    	$.ajax({
    		
    		type: "GET"
    	,	url: "/patternSearch/selectWorkSearch.do"	
    	,	dataType: "JSON"    	    	
    	,	data: data	
    	,	contentType: "application/json"
    	,	success: function(obj) {    			    		
    			console.log(obj);
    			listFunc(obj);
    		}
    	,	error: function(xhr, status, error) { alert('실패'); }
    	});	
    	
    	/* 그래프 목록 */
    	$.ajax({
    		
    		type: "GET"
    	,	url: "/patternSearch/selectBarWorkSearch.do"	
    	,	dataType: "JSON"    	    	
    	,	data: data	
    	,	contentType: "application/json"
    	,	success: function(obj) {    			    		
    			console.log(obj);
    			/* 그래프 그리는 메서드 */
    			chartFunc(obj);
    		}
    	,	error: function(xhr, status, error) { alert('실패'); }
    	});	    	
	};
	
	function listFunc(obj) {		

		/* 요기 뿌리는 방법 고민하기 */
		var html = '';
		
		if(obj.length > 0) {
						
			for(i=0; i<obj.length; i++) {
				
					html = 		'<div class="content">' 	
							+			'<div class="doWorkWrap">'
							+			'<label name="doWork" class="doWork">' + obj[i].work + '</label>'
							+		'</div>'	
							+		'<div class="doDtlViWrap">'
							+			'<input type="button" name="doDtlVi" class="basicBtn" value="상세보기"/>'
							+		'</div>'	
							+		'<div class="doDateWrap">'
							+			'<label name="doDate" class="doDate">' + obj[i].regi_date + '</label>'
							+		'</div>'				
							+	'</div>';
				
			}
			
			html = 		'<div class="middle">' + html + '</div>'
			
			console.log(html);
			
			$('.wrap').append(html);
		}	
	}
	
	function chartFunc(obj) {		
		/************************************** 차트 ***********************************************/
		// 우선 컨텍스트를 가져옵니다. 
		var ctx = document.getElementById("myChart").getContext('2d');
		
		var allData = obj;
		
		var label = [];
		var data  = [];
		var color = []; 
		var colorList = [ 'rgba(255, 127, 080, 0.7)'
				        , 'rgba(123, 104, 238, 0.7)'
				        , 'rgba(064, 224, 208, 0.7)'
				        ];
		
		for(i=0; i<allData.length; i++) {
			
			label[i] = allData[i].work;
			data[i]  = allData[i].ranking;
			color[i] = colorList[i%3];
			
	/*		alert('label' + [i] + ' = ' + label[i]);
			alert('data' + [i] + ' = ' + data[i]);*/
		}
		
		/*
		- Chart를 생성하면서, 
		- ctx를 첫번째 argument로 넘겨주고, 
		- 두번째 argument로 그림을 그릴때 필요한 요소들을 모두 넘겨줍니다. 
		*/
		var myChart = new Chart(ctx, {
		    type: 'bar',
		    data: {
		        labels: label,
		        datasets: [{
		            label: 'Char Js Test',
		            data: data,
		            backgroundColor: color,
		            borderColor: [
	
		            ],
		            borderWidth: 1
		        }]
		    },
		    options: {
		        maintainAspectRatio: true, // default value. false일 경우 포함된 div의 크기에 맞춰서 그려짐.
		        title: { 
		        	/* 타이틀 설정 */
		        	display: true
		    	,	text: 'RANKING'
		    	,	fontColor: 'red'
		    	,	fontSize: 40
		    	,	fontFamily: 'serif'
		        }
		    ,	legend: {
		    	/* 범례 안보이게 */
		    		display: false 
		    	}
		    ,   scales: {
		            yAxes: [{
		                ticks: {
		                   beginAtZero:true
		                }
		            }]
		        }
		    }
		});
		/************************************** 차트 END ***********************************************/
	}
	/* 조회 */
	$('#searchBtn').click(function() {
		
		$.fn.listSearch();
	});
});	





