package com.ems.ThymeLeaf.service;

import com.ems.ThymeLeaf.entity.Employee;

public interface employeeService{
	
	void saveEmployee(Employee employee);
	Employee getEmployeeById(int eid);
	void deleteEmployeeById(int eid);
	
}
