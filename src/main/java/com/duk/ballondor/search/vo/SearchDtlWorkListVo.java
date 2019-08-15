package com.duk.ballondor.search.vo;

public class SearchDtlWorkListVo {

	private int idx;         // 조회화면 idx
	private String content;  // 상세화면 내용
	private String user_id;  // 세션 ID
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
}
