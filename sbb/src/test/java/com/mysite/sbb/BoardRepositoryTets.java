package com.mysite.sbb;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.sbb.t_board.BoardDTO;
import com.mysite.sbb.t_board.BoardRepository;

import lombok.extern.log4j.Log4j2;

@Log4j2
@SpringBootTest
class BoardRepositoryTets {

	@Autowired
	private BoardRepository boardRepository;

	@Test
	void testGetBoardList() {
		List<BoardDTO> list = boardRepository.getBoardList();
		
		for(BoardDTO dto:list) {
			log.info(dto);
		}
	}

}
