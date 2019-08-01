/*
 * programID : PatternRegiControlloer.java
 * 내용      : 등록 페이지 Conteroller
 * */

package com.duk.ballondor.search.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.duk.ballondor.common.LoggerInterceptor;

@Controller
@RequestMapping(value="/patternSearch")
public class PatternSearchController {
	
	protected final Logger logger = LoggerFactory.getLogger(LoggerInterceptor.class);
	
	/*@Autowired
	private PatternSearchService patternSearchService;*/
	
	@RequestMapping(value="/patternSearchView.do")
	public String search(HttpServletRequest request, HttpServletResponse response) throws Exception {
				return "patternSearch/patternSearchView";		
	}		
}
