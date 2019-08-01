/*
 * programID : PatternRegiControlloer.java
 * 내용      : 등록 페이지 Conteroller
 * */

package com.duk.ballondor.regi.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.duk.ballondor.common.LoggerInterceptor;
import com.duk.ballondor.regi.dto.WorkListDto;
import com.duk.ballondor.regi.service.PatternRegiService;
import com.duk.ballondor.regi.vo.WorkListVo;

@Controller
@RequestMapping(value="/patternRegi")
public class PatternRegiController {
	
	protected final Logger logger = LoggerFactory.getLogger(LoggerInterceptor.class);
	
	@Autowired
	private PatternRegiService patternRegiService;
	
	@RequestMapping(value="/patternRegiView.do")
	public String register(HttpServletRequest request, HttpServletResponse response) throws Exception {
				return "patternRegi/patternRegiView";		
	}	
	
	/* popUp select */
	@RequestMapping(value="/getPopWorkList.do")
	@ResponseBody
	public List<WorkListDto> getPopWorkList(WorkListVo param) throws Exception{				
				
		List<WorkListDto> workList = patternRegiService.getWorkList(param);		
		return workList;
	}
	
	/* popUp register */
	@RequestMapping(value="/insertPopWorkRegi.do")
	@ResponseBody
	public int insertPopWorkRegi(WorkListVo param) throws Exception{				
				
		return patternRegiService.insertPopWorkRegi(param);				
	}
	
	/*
	 * 의문
	 * - pop 조회 및 등록 시 GET을 사용해도 되는데 왜 메인 등록 시에만 POST를 사용해야 하는가
	 * - @RequestBody를 WorkListVo 앞에 붙여야 하는 이유
	 * - HttpServletRequest request, HttpServletResponse response 이란?
	 */
	/* register */
	@RequestMapping(value="/insertWorkRegi.do", method=RequestMethod.POST)
	@ResponseBody
	public int insertWorkRegi(@RequestBody WorkListVo param) throws Exception{				
		
		for(WorkListVo vo : param.getWorkList()) {
			
			logger.debug("user_id : " + vo.getUser_id());
			logger.debug("work : " + vo.getWork());
			logger.debug("content : " + vo.getContent());
			logger.debug("regiDate : " + vo.getRegiDate());
		}
		return patternRegiService.insertWorkRegi(param.getWorkList());				
	}	
}
