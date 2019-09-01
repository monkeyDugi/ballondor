/*
 * programID : MemeberControlloer.java
 * 내용      : 로그인 Conteroller
 * */

package com.duk.ballondor.member.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.duk.ballondor.common.LoggerInterceptor;
import com.duk.ballondor.member.service.MemberService;
import com.duk.ballondor.member.vo.MemberVo;

@Controller
@RequestMapping(value="/member")
public class MemberController {
	
	protected final Logger logger = LoggerFactory.getLogger(LoggerInterceptor.class);
	
	@Inject
	MemberService memberService;
	
	// 01. 로그인 화면
	@RequestMapping(value="/login.do")
	public String login() {
		return "member/login";
	}
	
	// 02. 로그인 처리
	// - 아이디와 비밀번호가 DB에 유효하면 TRUE를 리턴 받아 로그인 성공.
	// - 서비스에서 성공 시 세션에 아이디와 이름 등록.
	@RequestMapping(value="/loginCheck.do")
	public ModelAndView loginCheck(@ModelAttribute MemberVo vo, HttpSession session) {
		
		vo.setUserId(vo.getUserId().trim());
		vo.setUserPw(vo.getUserPw().trim());
		
		logger.debug("getUserId: " + vo.getUserId());
		logger.debug("getUserPw: " + vo.getUserPw());
		
		boolean result = memberService.loginCheck(vo, session);
		
		logger.debug("로그인 결과  : " + String.valueOf(result));
		
		ModelAndView mav = new ModelAndView();
		
		// 로그인 성공
		if(result == true) {
			
			// 메인 페이지로 이동
			mav.setViewName("patternMain/patternMainView");
			// 메인으로 넘길 key, data
			mav.addObject("msg", "success");
			// 로그인 실패
		} else {
			
			// 로그인 페이지로 이동
			mav.setViewName("member/login");
			mav.addObject("msg", "failure");			
		}
		
		return mav;
	}
	
	// 03. 로그아웃 처리
	@RequestMapping(value="logout.do")
	public ModelAndView logout(HttpSession session) {
		
		memberService.logout(session);
		
		ModelAndView mav = new ModelAndView();
		
		// 메인 페이지로 이동
		mav.setViewName("patternMain/patternMainView");
		/*mav.addObject("msg", "logout");*/
		
		return mav;
	}
	
	// 01. 회원가입 화면
	@RequestMapping(value="/signUp.do")
	public String signUp() {
		return "member/signUp";
	}	
	
	// 02. 회원가입 처리
	// - 아이디가 DB에 유효하면 TRUE를 리턴 받아 회원가입 실패
	// - 가입완료 시 로그인 화면으로 이동
	@RequestMapping(value="/signUpCheck.do")
	public ModelAndView signUpCheck(@ModelAttribute MemberVo vo, HttpSession session) {
		
		vo.setUserId(vo.getUserId().trim());
		vo.setUserName(vo.getUserName().trim());
		vo.setUserPw(vo.getUserPw().trim());
		
		logger.debug("getUserId: " + vo.getUserId());
		logger.debug("getUserName: " + vo.getUserName());
		logger.debug("getUserPw: " + vo.getUserPw());
		
		boolean result = memberService.signUpCheck(vo, session);
		
		logger.debug("회원가입 결과 : " + String.valueOf(result));
		
		ModelAndView mav = new ModelAndView();
		
		// 회원가입 실패
		if(result == false) {
			
			// 회원가입 페이지로 이동
			mav.setViewName("member/signUp");
			// 메인으로 넘길 key, data
			mav.addObject("msg", "failure");
			// 회원가입 성공
		} else {
			
			// 로그인 페이지로 이동
			mav.setViewName("member/login");				
		}
		
		return mav;
	}	
}
