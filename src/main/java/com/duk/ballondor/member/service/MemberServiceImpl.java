/*
 * programID : MemeberServiceImpl.java
* 내용      : 로그인 서비스 구현
 * */

package com.duk.ballondor.member.service;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Service;

import com.duk.ballondor.member.dao.MemberDao;
import com.duk.ballondor.member.vo.MemberVo;

import lombok.extern.slf4j.Slf4j;


@Service
@Slf4j
public class MemberServiceImpl implements MemberService {
	
	@Inject
	MemberDao memberDao;
	
	// 01_01. 회원 로그인 체크
	@Override
	public boolean loginCheck(MemberVo vo, HttpSession session) {
		
		boolean result = memberDao.loginCheck(vo);
		
		// true이면 세션 등록
		if(result) {
			
			MemberVo vo2 = viewMember(vo);
			// 세션 변수 등록
			session.setAttribute("userId", vo2.getUserId());
			session.setAttribute("userName", vo2.getUserName());
			
			log.debug("session userId : " + vo2.getUserId());
			log.debug("session userName : " + vo2.getUserName());
		}
		return result;
	}
	
	// 01_02. 회원 로그인 정보
	@Override
	public MemberVo viewMember(MemberVo vo) {
		
		return memberDao.viewMember(vo);
	}
	
	
	// 01_01. 회원가입ID 중복 체크
	@Override
	public boolean signUpCheck(MemberVo vo, HttpSession session) {
		
		// 아이디 중복이면 false 리턴
		boolean result = memberDao.signUpCheck(vo);
		
		if(result == true) {
			
			insertMember(vo);
		}	
		
		return result;
	}
	
	// 01_02. 회원가입 insert
	@Override
	public void insertMember(MemberVo vo) {
		
		memberDao.insertMember(vo);
	}	
}
