package com.mybatis.join.vo;

import org.springframework.stereotype.Component;

@Component
public class JobHistoryVO {

	private int eno;
	private String sdate;
	private String edate;
	private String job;
	private String dno;
	
	public JobHistoryVO() {}
	
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public String getSdate() {
		return sdate;
	}
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	public String getEdate() {
		return edate;
	}
	public void setEdate(String edate) {
		this.edate = edate;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getDno() {
		return dno;
	}
	public void setDno(String dno) {
		this.dno = dno;
	}
	
	
	
	
}
