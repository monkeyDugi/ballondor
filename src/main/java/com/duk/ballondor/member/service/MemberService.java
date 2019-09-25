/*
 * programID : MemberService.java
  * 내용      : 로그인 인터페이스
 * */

package com.duk.ballondor.member.service;

import javax.servlet.http.HttpSession;

import com.duk.ballondor.member.vo.MemberVo;

public interface MemberService {

	// 01_01. 회원 로그인 체크
	public boolean loginCheck(MemberVo vo, HttpSession session);
	
	// 01_02. 회원 로그인 정보
	public MemberVo viewMember(MemberVo vo);

	// 01_01. 회원가입 ID 중복 체크
	public boolean signUpCheck(MemberVo vo, HttpSession session);

	// 01_02. 회원가입 insert
	public void insertMember(MemberVo vo);
}
