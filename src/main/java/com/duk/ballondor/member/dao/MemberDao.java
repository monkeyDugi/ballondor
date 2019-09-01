/*
 * programID : MemberDao.java
 * 내용   	 : 로그인 DAO
 * */

package com.duk.ballondor.member.dao;

import javax.servlet.http.HttpSession;

import com.duk.ballondor.member.vo.MemberVo;

public interface MemberDao {

	// 01_01. 회원 로그인 체크
	public boolean loginCheck(MemberVo vo);
	
	// 01_02. 회원 로그인 정보
	public MemberVo viewMember(MemberVo vo);
	
	// 02. 회원 로그아웃
	public void logout(HttpSession session);

	// 01_01. 회원가입ID 중복 체크
	public boolean signUpCheck(MemberVo vo);

	// 01_02. 회원가입 insert
	public void insertMember(MemberVo vo);
}
