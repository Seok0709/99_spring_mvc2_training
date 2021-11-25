package com.spring.mvc_training.board.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.mvc_training.board.dao.BoardDao;
import com.spring.mvc_training.board.dto.BoardDto;

public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDao boardDao;
	
	@Override
	public void insertBoard(BoardDto boardDto) {
		boardDao.insert(boardDto);
		
	}

}
