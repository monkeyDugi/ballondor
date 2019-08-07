/*
 * programID : PatternMainControlloer.java
 * 내용      : 메인 페이지 Conteroller
 * */

package com.duk.ballondor.main.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.duk.ballondor.common.LoggerInterceptor;

@Controller
@RequestMapping(value="/patternMain")
public class PatternMainController {
	
	protected final Logger logger = LoggerFactory.getLogger(LoggerInterceptor.class);
	
	@Autowired
	/*private PatternSearchService patternSearchService;*/
	
	/* 조회 */
	@RequestMapping(value="/patternMainView.do")
	public String mainView(HttpServletRequest request, HttpServletResponse response) throws Exception {
			return "patternMain/patternMainView";		
	}
}
