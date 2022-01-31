package com.te.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.te.ems.model.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	public Employee findByEmpId(int empId);

}
