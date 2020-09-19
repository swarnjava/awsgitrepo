package com.test.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.test.entity.EmployeeInfo;
import com.test.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository empRepo;
	
	
	@Override
	public List<EmployeeInfo> getEmployees() {
		// TODO Auto-generated method stub
		return empRepo.findAll();
	}


	@Override
	public void saveEmployee(EmployeeInfo emp) {
		// TODO Auto-generated method stub
		empRepo.save(emp);
	}

}
