

package com.duk.ballondor.regi.vo;

import java.util.List;

public class WorkListVo {

	private String user_id;  
	private String work;      
	private String content;   
	private String regiDate;  
	private List<WorkListVo> workList;
	
	
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
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getRegiDate() {
		return regiDate;
	}
	public void setRegiDate(String regiDate) {
		this.regiDate = regiDate;
	}
	
	public List<WorkListVo> getWorkList() {
		return workList;
	}
	public void setWorkList(List<WorkListVo> workList) {
		this.workList = workList;
	}
	
}
