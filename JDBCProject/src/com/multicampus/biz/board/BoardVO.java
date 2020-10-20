package com.multicampus.biz.board;

import java.sql.Date;

import lombok.Data;

// VO(Value Object) 클래스(= DTO)
// 테이블의 컬럼이름과 동일하게 멤버변수 선언해야 함.
// Alt + Shift + S : source
// Ctrl + Shift + O : 자동 import
/*
@Getter
@Setter
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
*/
@Data
public class BoardVO{
	private int seq;
	private String title;
	private String writer;	
	private String content;
	private Date regDate;
	private int cnt;

}
