package com.springBook.biz.board.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.springBook.biz.board.BoardVO;
import com.springBook.biz.common.JDBCUtil;

public class BoardDAO {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	private final String boardInsert = "INSERT INTO board(seq, title, writer, content) "
						+ "VALUES (SELECT nv1(MAX(seq), 0) +1 FROM board), ?, ?, ?);";
	private final String boardUpdate = "UPDATE board SET title = ?, content = ?, WHERE seq = ?;";
	private final String boardDelete = "DELETE FROM board WHERE seq = ?;";
	private final String boardGet = "SELECT * FROM board WHERE seq = ?;";
	private final String boardList = "SELECT * FROM board ORDER BY seq DESC;";	
	
	public void insertBoard(BoardVO board) {
		System.out.println("insertBoard");
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(boardInsert);
			pstmt.setString(1, board.getTitle());
			pstmt.setString(2, board.getWriter());
			pstmt.setString(3, board.getContent());		
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, conn);
		}		
	}
	
	public void updateBoard(BoardVO vo) {
		System.out.println("updateBoard");
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(boardUpdate);
			pstmt.setString(1, vo.getTitle());
			pstmt.setString(2, vo.getContent());
			pstmt.setInt(3, vo.getSeq());			
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, conn);
		}		
	}
	
	public void deleteBoard(BoardVO vo) {
		System.out.println("deleteBoard");
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(boardDelete);
			pstmt.setInt(1, vo.getSeq());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(pstmt, conn);
		}		
	}
	
	public BoardVO getBoard(BoardVO vo) {
		System.out.println("getBoard");
		BoardVO board = null;
		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(boardGet);
			pstmt.setInt(1, vo.getSeq());
			rs = pstmt.executeQuery();
			if(rs.next()) {
				board = new BoardVO();
				board.setSeq(rs.getInt("seq"))
					.setTitle(rs.getString("title"))
					.setWriter(rs.getString("writer"))
					.setContent(rs.getString("content"))
					.setRegDate(rs.getDate("regDate"))
					.setCnt(rs.getInt("cnt"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, conn);			
		}
		return board;
	}
	
	public List<BoardVO> getBoardList(BoardVO vo) {
		System.out.println("getBoardList");
		List<BoardVO> list = new ArrayList<BoardVO>();

		try {
			conn = JDBCUtil.getConnection();
			pstmt = conn.prepareStatement(boardList);
			pstmt.setInt(1, vo.getSeq());
			rs = pstmt.executeQuery();
			
			BoardVO board;			
			if(rs.next()) {
				board = new BoardVO();
				board.setSeq(rs.getInt("seq"))
					.setTitle(rs.getString("title"))
					.setWriter(rs.getString("writer"))
					.setContent(rs.getString("content"))
					.setRegDate(rs.getDate("regDate"))
					.setCnt(rs.getInt("cnt"));
				list.add(board);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtil.close(rs, pstmt, conn);			
		}
		return list;
	}		
}
