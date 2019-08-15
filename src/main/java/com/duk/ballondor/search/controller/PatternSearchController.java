/*
 * programID : PatternSearchControlloer.java
 * 내용      : 조회 페이지 Conteroller
 * */

package com.duk.ballondor.search.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.duk.ballondor.common.LoggerInterceptor;
import com.duk.ballondor.search.dto.SearchDtlWorkListDto;
import com.duk.ballondor.search.dto.SearchWorkListDto;
import com.duk.ballondor.search.service.PatternSearchService;
import com.duk.ballondor.search.vo.SearchDtlWorkListVo;
import com.duk.ballondor.search.vo.SearchWorkListVo;

@Controller
@RequestMapping(value="/patternSearch")
public class PatternSearchController {
	
	protected final Logger logger = LoggerFactory.getLogger(LoggerInterceptor.class);
	
	@Autowired
	private PatternSearchService patternSearchService;
	
	/* 조회 화면*/
	@RequestMapping(value="/patternSearchView.do")
	public String search(HttpServletRequest request, HttpServletResponse response) throws Exception {
			return "patternSearch/patternSearchView";		
	}
	
	/* 상세보기 화면 이동*/
	@RequestMapping(value="/patternSearchDtlView.do")
	public String searchDtl(HttpServletRequest request, HttpServletResponse response) throws Exception {
		return "patternSearch/patternSearchDtlView";		
	}		
	
	/* 조회 */
	@RequestMapping(value="/selectWorkSearch.do")
	@ResponseBody
	public List<SearchWorkListDto> getWorkList(SearchWorkListVo param) throws Exception{				
				
/*		logger.debug(param.getFrom_date());
		logger.debug(param.getTo_date());
		logger.debug(param.getUser_id());*/
		List<SearchWorkListDto> workList = patternSearchService.getWorkList(param);		
		return workList;
	}
	
	/* 그래프 조회 */
	@RequestMapping(value="/selectBarWorkSearch.do")
	@ResponseBody
	public List<SearchWorkListDto> getBarWorkList(SearchWorkListVo param) throws Exception{				
		
		/*		logger.debug(param.getFrom_date());
		logger.debug(param.getTo_date());
		logger.debug(param.getUser_id());*/
		List<SearchWorkListDto> workBarList = patternSearchService.getBarWorkList(param);		
		return workBarList;
	}	
	
	/* 상세화면 최초 조회 */
	@RequestMapping(value="/selectDtlWorkSearch.do")
	@ResponseBody
	public List<SearchDtlWorkListDto> getDtlWorkList(SearchDtlWorkListVo param) throws Exception{				
				
		logger.debug("idx : " + param.getIdx());
		
		List<SearchDtlWorkListDto> dtlWorkList = patternSearchService.getDtlWorkList(param);		
		return dtlWorkList;
	}
	
	/* 상세 수정 */
	@RequestMapping(value="/updateDtl.do")
	@ResponseBody
	public int updateDtl(SearchDtlWorkListVo param) throws Exception{				
		
		return patternSearchService.updateDtl(param);				
	}	
}
