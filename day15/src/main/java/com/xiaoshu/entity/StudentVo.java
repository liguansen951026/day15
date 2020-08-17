package com.xiaoshu.entity;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class StudentVo extends Student{

	private String tname;
	private Integer num;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date entrytime1;
	@DateTimeFormat(pattern="yyyy-MM-dd")
	private Date entrytime2;
	
	public Date getEntrytime1() {
		return entrytime1;
	}
	public void setEntrytime1(Date entrytime1) {
		this.entrytime1 = entrytime1;
	}
	public Date getEntrytime2() {
		return entrytime2;
	}
	public void setEntrytime2(Date entrytime2) {
		this.entrytime2 = entrytime2;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	@Override
	public String toString() {
		return "StudentVo [tname=" + tname + ", num=" + num + ", entrytime1=" + entrytime1 + ", entrytime2="
				+ entrytime2 + "]";
	}
	
}
