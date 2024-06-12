package com.mysite.sbb.t_board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardRepository {
	List<BoardDTO> getBoardList();
}
