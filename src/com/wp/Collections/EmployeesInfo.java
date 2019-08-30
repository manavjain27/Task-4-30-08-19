package com.wp.Collections;

public class EmployeesInfo {
	
	public int empno;
	public String ename;
	public Double esal;
	public String empDesignation;
	public String empDepartment;
	
	
	

	public EmployeesInfo(int empno, String ename, Double esal, String empDesignation, String empDepartment) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.esal = esal;
		this.empDesignation = empDesignation;
		this.empDepartment = empDepartment;
	}




	@Override
	public String toString() {
		return "Employee No:=" + empno + ",\nEmployee Name=" + ename + ",\nEmployee Salary=" + esal + ",\nEmployee Designation="
				+ empDesignation + ",\nEmployee Department=" + empDepartment + "";
	}




}
