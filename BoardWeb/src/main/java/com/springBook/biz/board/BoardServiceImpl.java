package com.springBook.biz.board;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springBook.biz.board.impl.BoardDAO;

//@Service("boardService")
public class BoardServiceImpl implements BoardService{

	@Autowired
	private	BoardDAO boardDAO;

	@Override
	public BoardVO getBoard(BoardVO vo) {
		return boardDAO.getBoard(vo);
	}
	
	@Override
	public List<BoardVO> getBoardList(BoardVO vo) {
		return boardDAO.getBoardList(vo);
	}
	
	@Override
	public void insertBoard(BoardVO vo) {
		boardDAO.insertBoard(vo);		
	}
	
	@Override
	public void updateBoard(BoardVO vo) {
		boardDAO.updateBoard(vo);
	}
	
	@Override
	public void deleteBoard(BoardVO vo) {
		boardDAO.deleteBoard(vo);
	}	
}
