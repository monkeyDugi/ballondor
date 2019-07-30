/*
 * programID : WorkListVo.java
 * 내용      : 등록 페이지 VO( Value Object )
 * */

package com.duk.ballondor.regi.vo;

import java.util.List;

public class WorkListVo {

	private String user_id;   // 회원 ID
	private String work;      // 등록할 일
	private String content;   // 등록할 일 내용
	private String regiDate;  // 메인 등록할 일자
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
