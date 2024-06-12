package com.mysite.sbb.t_board;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class BoardDTO {
	private Long no;
	private String title;
	private int re;
	private String regdate;
}
