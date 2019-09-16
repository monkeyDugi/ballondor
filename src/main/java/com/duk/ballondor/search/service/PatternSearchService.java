/*
 * programID : PatternSearchService.java
 * 내용      : 조회 페이지 Service
 * */

package com.duk.ballondor.search.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duk.ballondor.search.dao.PatternSearchDao;
import com.duk.ballondor.search.dto.SearchDtlWorkListDto;
import com.duk.ballondor.search.dto.SearchWorkListDto;
import com.duk.ballondor.search.vo.SearchDtlWorkListVo;
import com.duk.ballondor.search.vo.SearchWorkListVo;

@Service
public class PatternSearchService {

	@Autowired
	private PatternSearchDao patternSearchDao;
	
	/* 조회 */
	public List<SearchWorkListDto> getWorkList(SearchWorkListVo param) {
		
		return patternSearchDao.getWorkList(param);
	}
	
	/* 그래프 조회 */
	public List<SearchWorkListDto> getBarWorkList(SearchWorkListVo param) {
		
		return patternSearchDao.getBarWorkList(param);
	}
	
	/* 상세조회 */
	public List<SearchDtlWorkListDto> getDtlWorkList(SearchDtlWorkListVo param) {
		
		return patternSearchDao.getDtlWorkList(param);
	}
	
	/* 상세수정 */
	public int updateDtl(SearchDtlWorkListVo param) {
		
		return patternSearchDao.updateDtl(param);
	}	
}
