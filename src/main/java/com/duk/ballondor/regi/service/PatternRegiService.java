/*
 * programID : PatternRegiService.java
 * 내용      : 등록페이지 Service
 * */

package com.duk.ballondor.regi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.duk.ballondor.regi.dao.PatternRegiDao;
import com.duk.ballondor.regi.dto.WorkListDto;
import com.duk.ballondor.regi.vo.WorkListVo;

@Service
public class PatternRegiService {

	@Autowired
	private PatternRegiDao patternRegiDao;
	
	/* popUp select */
	public List<WorkListDto> getWorkList(WorkListVo param) {
		
		return patternRegiDao.getWorkList(param);
	}
	
	/* popUp register */	
	public int insertPopWorkRegi (WorkListVo param) {
		
		return patternRegiDao.insertPopWorkRegi(param);
	}	
	
	/* register */	
	public int insertWorkRegi (List<WorkListVo> param) {
		
		return patternRegiDao.insertWorkRegi(param);
	}	
}
