/*
 * ProgramID : MemberVo.java
 * 내용      : 로그인 VO
 * */

package com.duk.ballondor.member.vo;

public class MemberVo {
	
	private String userId;
	private String userPw;
	private String userName;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPw() {
		return userPw;
	}
	public void setUserPw(String userPw) {
		this.userPw = userPw;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
}
