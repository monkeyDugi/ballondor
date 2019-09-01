package com.duk.ballondor.member.dao;

import javax.inject.Inject;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.duk.ballondor.member.vo.MemberVo;

@Repository
public class MemberDaoImpl implements MemberDao {

	@Inject
	SqlSession sqlSession;
	
	private static final String NAMESPACE = "com.duk.ballondor.member.memberMapper.";
	
	// 01_01. 회원 로그인 체크
	@Override
	public boolean loginCheck(MemberVo vo) {
		String name = sqlSession.selectOne(NAMESPACE + "loginCheck", vo);
		return (name == null) ? false : true;
	}

	// 01_02. 회원 로그인 정보
	@Override
	public MemberVo viewMember(MemberVo vo) {
		
		return sqlSession.selectOne(NAMESPACE + "viewMember", vo);
	}

	@Override
	public void logout(HttpSession session) {
		// TODO Auto-generated method stub

	}
	
	// 01_01. 회원가입ID 중복 체크
	@Override
	public boolean signUpCheck(MemberVo vo) {
		String userId = sqlSession.selectOne(NAMESPACE + "signUpCheck", vo);
		return (userId == null) ? true : false;
	}

	// 01_02. 회원가입 insert
	@Override
	public void insertMember(MemberVo vo) {
		
		sqlSession.insert(NAMESPACE + "insertMember", vo);
	}	

}
