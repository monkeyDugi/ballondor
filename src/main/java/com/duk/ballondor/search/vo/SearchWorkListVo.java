package com.duk.ballondor.search.vo;

public class SearchWorkListVo {

	private String user_id;  		// 회원 ID
	private String from_date;  	    // 조회 from 일자
	private String to_date;         // 조회 to 일자
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getFrom_date() {
		return from_date;
	}
	public void setFrom_date(String from_date) {
		this.from_date = from_date;
	}
	public String getTo_date() {
		return to_date;
	}
	public void setTo_date(String to_date) {
		this.to_date = to_date;
	}
	
	
	
}
