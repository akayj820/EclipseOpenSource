package com.multicampus.biz.board;

import java.sql.Date;

import lombok.Data;

// VO(Value Object) Ŭ����(= DTO)
// ���̺��� �÷��̸��� �����ϰ� ������� �����ؾ� ��.
// Alt + Shift + S : source
// Ctrl + Shift + O : �ڵ� import
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
