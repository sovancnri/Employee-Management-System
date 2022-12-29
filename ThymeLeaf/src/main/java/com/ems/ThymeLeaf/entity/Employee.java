package com.ems.ThymeLeaf.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name="emp", uniqueConstraints = @UniqueConstraint(columnNames="empUsrnm"))
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	@Column
	private String empUsrnm;
	@Column
	private String empPwd;
	@Column
	private String empRole;
	@OneToOne(mappedBy = "employee")
    private User user;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String empUsrnm, String empPwd, String empRole) {
		super();
		this.empUsrnm = empUsrnm;
		this.empPwd = empPwd;
		this.empRole = empRole;
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
