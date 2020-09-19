package com.test.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.test.entity.EmployeeInfo;


public interface EmployeeService {

	public List<EmployeeInfo> getEmployees();
	public void saveEmployee(EmployeeInfo emp);
}
