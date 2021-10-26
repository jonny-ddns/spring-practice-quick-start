package com.springBook.biz.board;

import java.util.List;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class BoardServiceClient {
	public static void main(String[] args) {
		
//		AbstractApplicationContext container = new GenericXmlApplicationContext("applicationContext.xml");
		
//		BoardService boardService = (BoardService) container.getBean("boardService");
//		System.out.println(">> 객체확인 = " + boardService);
		
//		if((BoardService) container.getBean("boardService") == null){
//			System.out.println("NULL 입니다");
//		}
		
//		BoardVO vo = new BoardVO();
//		vo.setTitle("안녕하세요");
//		vo.setWriter("홍길동");
//		vo.setContent("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.");
//		boardService.insertBoard(vo);
//		
//		List<BoardVO> list = boardService.getBoardList(vo);
//		for(BoardVO board : list) {
//			System.out.println(board.toString());
//		}
//		container.close();
	}
}
