package com.duk.ballondor;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MySQLConnectionTest {

	protected final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	static final String DRIVER    = "com.mysql.cj.jdbc.Driver";
	static final String URL       = "jdbc:mysql://localhost:3306/ballondor?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
	static final String USERNAME  = "root";
	static final String PASSWORD  = "1111"; 
	
	@Test
	public void getMySQLConnection() {
		
		Connection conn = null;
		Statement  stmt = null;
		
		try {
			
			logger.info("==============================MySQL Connection START========================");
			
			Class.forName(DRIVER);
			
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
			stmt = conn.createStatement();
			
			String sql = "SELECT * FROM BALLONDOR.MEMBER;";
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				String memberId = rs.getString("MEMBER_ID");
				String memberName = rs.getString("MEMBER_NAME");
				String memberPw = rs.getString("MEMBER_PW");
				
				logger.info("memberId " + memberId);
				logger.info("memberName " + memberName);
				logger.info("memberPw "  + memberPw);
			}
			
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException se1) {
			se1.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				if(stmt != null) {
					stmt.close();
				}
			} catch (SQLException se) {
				se.printStackTrace();
			}
			
			try {
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		
		logger.info("=========================================MySQL Connection END===============================");
	}
}
