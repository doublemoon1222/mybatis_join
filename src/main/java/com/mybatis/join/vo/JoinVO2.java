package com.mybatis.join.vo;

public class JoinVO2 {

	private EmployeesVO empA; 
	private DepartmentsVO deptA;
	private JobHistoryVO jobA;
	private LocationVO locA;
	
	public JoinVO2() {}
	
	public JoinVO2(EmployeesVO empA, DepartmentsVO deptA, JobHistoryVO jobA, LocationVO locA) {
		super();
		this.empA = empA;
		this.deptA = deptA;
		this.jobA = jobA;
		this.locA = locA;
	}

	public EmployeesVO getEmpA() {
		return empA;
	}

	public void setEmpA(EmployeesVO empA) {
		this.empA = empA;
	}

	public DepartmentsVO getDeptA() {
		return deptA;
	}

	public void setDeptA(DepartmentsVO deptA) {
		this.deptA = deptA;
	}

	public JobHistoryVO getJobA() {
		return jobA;
	}

	public void setJobA(JobHistoryVO jobA) {
		this.jobA = jobA;
	}

	public LocationVO getLocA() {
		return locA;
	}

	public void setLocA(LocationVO locA) {
		this.locA = locA;
	}
	

}
