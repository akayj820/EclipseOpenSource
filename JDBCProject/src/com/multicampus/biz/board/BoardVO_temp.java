package com.multicampus.biz.board;

import java.sql.Date;

// VO(Value Object) Ŭ����(= DTO)
// ���̺��� �÷��̸��� �����ϰ� ������� �����ؾ� ��.
// Alt + Shift + S
public class BoardVO_temp{
	private int seq;
	private String title;
	private String writer;	
	private String content;
	private Date regDate;
	private int cnt;
/*	
	public BoardVO(int seq, String title, String writer, String content, Date regDate, int cnt) {
		super();
		this.seq = seq;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.regDate = regDate;
		this.cnt = cnt;
	}
*/	
	public int getSeq() {
		return seq;
	}
	public void setSeq(int seq) {
		this.seq = seq;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	public int getCnt() {
		return cnt;
	}
	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	
	@Override
	public String toString() {
		return "BoardVO [seq=" + seq + ", title=" + title + ", writer=" + writer + ", content=" + content + ", regDate="
				+ regDate + ", cnt=" + cnt + "]";
	}

	public static void main(String[] args) {
		BoardVO_temp vo = new BoardVO_temp();
		vo.setTitle("�ӽ� ����...");
		
		System.out.println("VO ��ü�� �� : " + vo);
		// override ���� ������ ��ü�� �ּҰ��� ������.
		// com.multicampus.biz.board.BoardVO@2a139a55
		
		// VO ��ü�� �� : BoardVO [seq=0, title=�ӽ� ����..., writer=null, content=null, regDate=null, cnt=0]
	}
}
