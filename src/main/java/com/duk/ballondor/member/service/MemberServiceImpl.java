/*
 * programID : MemeberServiceImpl.java
 * 내용      : 로그인 서비스 구현
 * */

package com.duk.ballondor.member.service;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.duk.ballondor.common.LoggerInterceptor;
import com.duk.ballondor.member.dao.MemberDao;
import com.duk.ballondor.member.vo.MemberVo;

@Service
public class MemberServiceImpl implements MemberService {

	protected final Logger logger = LoggerFactory.getLogger(LoggerInterceptor.class);
	
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
			
			logger.debug("session userId : " + vo2.getUserId());
			logger.debug("session userName : " + vo2.getUserName());
		}
		return result;
	}
	
	// 01_02. 회원 로그인 정보
	@Override
	public MemberVo viewMember(MemberVo vo) {
		
		return memberDao.viewMember(vo);
	}
	
	// 02. 회원 로그아웃
	@Override
	public void logout(HttpSession session) {
		
		// 세션 정보 초기화
		session.invalidate();
	}
}
