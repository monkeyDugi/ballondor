package com.duk.ballondor;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/*.xml"})
public class MyBatisTest {

	protected final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Inject
	private SqlSessionFactory sqlSessionFactory;
	
	@Test
	public void MyBatisSessionTest() throws Exception {
		
		SqlSession sessions = null;
		
		try {
			logger.debug("sqlSessionFactory : [{}]", sqlSessionFactory);
			sessions = sqlSessionFactory.openSession();
			logger.debug("sessions : [{}]", sessions);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
