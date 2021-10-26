package com.springBook.biz.board;

import java.sql.Date;

public class BoardVO {
	private int seq;
	private String title;
	private String writer;
	private String content;
	private Date regDate;
	private int cnt;	

	public int getSeq() {
		return seq;
	}
	public BoardVO setSeq(int seq) {
		this.seq = seq;
		return this;
	}
	public String getTitle() {
		return title;
	}
	public BoardVO setTitle(String title) {
		this.title = title;
		return this;
	}
	public String getWriter() {
		return writer;
	}
	public BoardVO setWriter(String writer) {
		this.writer = writer;
		return this;
	}
	public String getContent() {
		return content;
	}
	public BoardVO setContent(String content) {
		this.content = content;
		return this;
	}
	public Date getRegDate() {
		return regDate;
	}
	public BoardVO setRegDate(Date regDate) {
		this.regDate = regDate;
		return this;
	}
	public int getCnt() {
		return cnt;
	}
	public BoardVO setCnt(int cnt) {
		this.cnt = cnt;
		return this;
	}
	
	@Override
	public String toString() {
		return "BoardVO [seq=" + seq + ", title=" + title + ", writer=" + writer + ", content=" + content + ", regDate="
				+ regDate + ", cnt=" + cnt + "]";
	}
}
