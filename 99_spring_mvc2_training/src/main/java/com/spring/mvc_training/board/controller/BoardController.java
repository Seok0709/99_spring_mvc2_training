package com.spring.mvc_training.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BoardController {

	@RequestMapping(value="/boardWrite" , method=RequestMethod.POST)
	public String boardWrite() {
		
		return "board/bWrtie";
	}
}
