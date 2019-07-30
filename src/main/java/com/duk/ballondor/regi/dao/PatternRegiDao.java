/*
 * programID : PatternRegiDao.java
 * 내용      : 등록 페이지 DAO( Data Access Object )
 * */

package com.duk.ballondor.regi.dao;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.duk.ballondor.regi.dto.WorkListDto;
import com.duk.ballondor.regi.vo.WorkListVo;


@Repository
public class PatternRegiDao {

	@Resource(name="sqlSession")
	private SqlSession sqlSession;
	
	private static final String NAMESPACE = "com.duk.ballondor.regi.regiMapper.";
	
	/* popUp select */
	public List<WorkListDto> getWorkList(WorkListVo param) throws Exception {
		
		return sqlSession.selectList(NAMESPACE + "getWorkList", param);
	}
	
	/* popUp register */
	public int insertPopWorkRegi (WorkListVo param) throws Exception {
		
		return sqlSession.insert(NAMESPACE + "insertPopWorkRegi", param);
	}	
	
	/* register */
	public int insertWorkRegi (List<WorkListVo> param) throws Exception {
		
		return sqlSession.insert(NAMESPACE + "insertWorkRegi", param);
	}	
}
