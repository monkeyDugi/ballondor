/*
 *  programID : patternSearch.js
 *  내용      : 등록된 패턴 그래프로 표시 및 목록 조회 
 */

$(function(){
	
	/************************************** 차트 ***********************************************/
	// 우선 컨텍스트를 가져옵니다. 
	var ctx = document.getElementById("myChart").getContext('2d');
	/*
	- Chart를 생성하면서, 
	- ctx를 첫번째 argument로 넘겨주고, 
	- 두번째 argument로 그림을 그릴때 필요한 요소들을 모두 넘겨줍니다. 
	*/
	var myChart = new Chart(ctx, {
	    type: 'bar',
	    data: {
	        labels: ["Red", "Blue", "Yellow", "Green", "Purple", "Orange"],
	        datasets: [{
	            label: '# of Votes',
	            data: [12, 19, 3, 5, 2, 3],
	            backgroundColor: [
	                'rgba(255, 99, 132, 1)',
	                'rgba(54, 162, 235, 1)',
	                'rgba(255, 206, 86, 1)',
	                'rgba(75, 192, 192, 1)',
	                'rgba(153, 102, 255, 1)',
	                'rgba(255, 159, 64, 1)'
	            ],
	            borderColor: [
	                'rgba(255,99,132,1)',
	                'rgba(54, 162, 235, 1)',
	                'rgba(255, 206, 86, 1)',
	                'rgba(75, 192, 192, 1)',
	                'rgba(153, 102, 255, 1)',
	                'rgba(255, 159, 64, 1)'
	            ],
	            borderWidth: 1
	        }]
	    },
	    options: {
	        maintainAspectRatio: true, // default value. false일 경우 포함된 div의 크기에 맞춰서 그려짐.
	        title: { 
	        	/* 타이틀 설정 */
	        	display: true
	    	,	text: 'Best Of Best TOP5 '
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
});	