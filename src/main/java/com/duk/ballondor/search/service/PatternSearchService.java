/*
 * programID : PatternSearchService.java
 * 내용      : 조회 페이지 Service
 * */

package com.duk.ballondor.search.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duk.ballondor.search.dao.PatternSearchDao;
import com.duk.ballondor.search.dto.SearchWorkListDto;
import com.duk.ballondor.search.vo.SearchWorkListVo;

@Service
public class PatternSearchService {

	@Autowired
	private PatternSearchDao patternSearchDao;
	
	/* 조회 */
	public List<SearchWorkListDto> getWorkList(SearchWorkListVo param) throws Exception {
		
		return patternSearchDao.getWorkList(param);
	}
	
	/* 그래프 조회 */
	public List<SearchWorkListDto> getBarWorkList(SearchWorkListVo param) throws Exception {
		
		return patternSearchDao.getBarWorkList(param);
	}
}
