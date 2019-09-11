/*
 * programID : PatternMainControlloer.java
 * 내용      : 메인 페이지 Conteroller
 * */

package com.duk.ballondor.main.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
@RequestMapping(value="/patternMain")
public class PatternMainController {
	
	/* 메인 */
	@RequestMapping(value="/patternMainView.do")
	public ModelAndView mainView(HttpSession session) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		
		// 메인 페이지로 이동
		mav.setViewName("patternMain/patternMainView");
		log.debug("메인 화면 세션 체크 : " + String.valueOf(session.getAttribute("userId")));
		
		if(session.getAttribute("userId") != null) {
			// 로그인 정보가 존재할 시 메인 화면으로 메세지를 던져준다.
			
			// 메인으로 넘길 key, data
			mav.addObject("msg", "success");					
		}
		
		return mav;			
	}
}
