package com.ems.ThymeLeaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ems.ThymeLeaf.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{
	
}
