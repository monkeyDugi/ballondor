/*
 * programID : PatternSearchDao.java
 * 내용      : 조회 페이지 DAO( Data Access Object )
 * */

package com.duk.ballondor.search.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.duk.ballondor.search.dto.SearchDtlWorkListDto;
import com.duk.ballondor.search.dto.SearchWorkListDto;
import com.duk.ballondor.search.vo.SearchDtlWorkListVo;
import com.duk.ballondor.search.vo.SearchWorkListVo;


@Repository
public class PatternSearchDao {

	@Resource(name="sqlSession")
	private SqlSession sqlSession;
	
	private static final String NAMESPACE = "com.duk.ballondor.search.searchMapper.";
	
	/* 조회 */
	public List<SearchWorkListDto> getWorkList(SearchWorkListVo param) throws Exception {
		
		return sqlSession.selectList(NAMESPACE + "getWorkList", param);
	}
	
	/* 그래프 조회 */
	public List<SearchWorkListDto> getBarWorkList(SearchWorkListVo param) throws Exception {
		
		return sqlSession.selectList(NAMESPACE + "getBarWorkList", param);
	}

	/* 상세조회 */
	public List<SearchDtlWorkListDto> getDtlWorkList(SearchDtlWorkListVo param) throws Exception {
		
		return sqlSession.selectList(NAMESPACE + "getDtlWorkList", param);
	}
	
	/* 상세수정 */
	public int updateDtl(SearchDtlWorkListVo param) throws Exception {
		
		return sqlSession.update(NAMESPACE + "updateDtl", param);
	}	
}
