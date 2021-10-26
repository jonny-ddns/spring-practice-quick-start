package com.springBook.biz.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//JDBC 연결 클래스 - h2와 연동
public class JDBCUtil {
	public static Connection getConnection() {
		try {
			Class.forName("org.h2.Driver");
//			String url = "jdbc:h2:tcp://localhost/~/test";
			String url = "jdbc:h2:tcp://D:/programming/Database/data/test";
			String id = "sa";
			String pw = "";
			return DriverManager.getConnection(url, id, pw);			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public static void close(PreparedStatement pstmt, Connection conn) {
		if(pstmt != null) {
			try {
				if(!pstmt.isClosed()) pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				pstmt = null;
			}
		}
		
		if(conn != null) {
			try {
				if(!conn.isClosed()) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				conn = null;
			}
		}		
	}
	
	public static void close(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		if(rs != null) {
			try {
				if(!rs.isClosed()) rs.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				rs = null;
			}
		}
		
		if(pstmt != null) {
			try {
				if(!pstmt.isClosed()) pstmt.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				pstmt = null;
			}
		}
		
		if(conn != null) {
			try {
				if(!conn.isClosed()) conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				conn = null;
			}
		}		
	}
}
