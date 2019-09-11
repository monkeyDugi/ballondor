/*
 * programID : MemeberControlloer.java
 * 내용      : 로그인 Conteroller
 * - ModelAndView를 사용해보고 싶어서 ajax 사용 안함. 오히려 회원가입에서 중복체크를 focusout 시 하려면 
 *   ajax를 비동기 식으로 했으면 어땠을까?
 * */

package com.duk.ballondor.member.controller;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.duk.ballondor.member.service.MemberService;
import com.duk.ballondor.member.vo.MemberVo;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping(value="/member")
public class MemberController {
	
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
		
		log.debug("================================== 로그인 정보 Start ==================================");
		log.debug(vo.toString());

		boolean result = memberService.loginCheck(vo, session);
		
		log.debug("로그인 결과  : " + String.valueOf(result));
		log.debug("================================== 로그인 정보 End==================================");
		
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
		
		log.debug("================================== 회원가입 정보 Start ==================================");
		log.debug(vo.toString());
		
		boolean result = memberService.signUpCheck(vo, session);
				
		log.debug("회원가입 결과 : " + String.valueOf(result));
		log.debug("================================== 회원가입 정보 End==================================");
		
		ModelAndView mav = new ModelAndView();
		
		// 회원가입 실패
		if(result == false) {
			
			// 회원가입 페이지로 이동
			mav.setViewName("member/signUp");
			// 메인으로 넘길 key, data
			mav.addObject("msg", "이미 사용 중이에요");
			// 회원가입 성공
		} else {
			
			// 로그인 페이지로 이동
			mav.setViewName("member/login");				
		}
		
		return mav;
	}	
}
