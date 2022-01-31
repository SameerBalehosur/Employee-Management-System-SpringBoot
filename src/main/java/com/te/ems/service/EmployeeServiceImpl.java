package com.te.ems.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.ems.model.Employee;
import com.te.ems.repository.EmployeeDao;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao dao;

	@Override
	public Employee delete(int empId) {
		Employee employee=dao.findByEmpId(empId);
		dao.delete(employee);
		return  employee;
	}

}
