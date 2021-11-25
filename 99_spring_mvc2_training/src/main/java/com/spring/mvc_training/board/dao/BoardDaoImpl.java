package com.spring.mvc_training.board.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import com.spring.mvc_training.board.dto.BoardDto;

public class BoardDaoImpl implements BoardDao {

	@Autowired
	private SqlSession sqlSession;
	@Override
	public void insert(BoardDto boardDto) {
		sqlSession.insert("mapper.BoardMapper99.insertBoard" , boardDto);
		
	}

}
