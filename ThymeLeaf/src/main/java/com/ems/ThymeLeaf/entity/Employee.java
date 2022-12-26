package com.ems.ThymeLeaf.entity;

public class Employee {

	private int empId;
	private String empUsrnm;
	private String empPwd;
	private String empRole;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpUsrnm() {
		return empUsrnm;
	}
	public void setEmpUsrnm(String empUsrnm) {
		this.empUsrnm = empUsrnm;
	}
	public String getEmpPwd() {
		return empPwd;
	}
	public void setEmpPwd(String empPwd) {
		this.empPwd = empPwd;
	}
	public String getEmpRole() {
		return empRole;
	}
	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empUsrnm=" + empUsrnm + ", empPwd=" + empPwd + ", empRole=" + empRole
				+ "]";
	}
	
}
