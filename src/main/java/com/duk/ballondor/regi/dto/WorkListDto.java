package com.duk.ballondor.regi.dto;

import java.util.Date;

public class WorkListDto {

	private String user_id;
	private String work;
	private Date   regi_date;
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public Date getRegi_date() {
		return regi_date;
	}
	public void setRegi_date(Date regi_date) {
		this.regi_date = regi_date;
	}
	
	
}
