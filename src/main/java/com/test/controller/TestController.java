package com.test.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.entity.EmployeeInfo;
import com.test.service.EmployeeService;

@RestController
public class TestController {

	
	@Autowired
	private EmployeeService empService;
	
	@GetMapping("/open")
	public String openApplication()
	{
		String resp="Hello Swarnendu....!!!!";
		
		
		return resp;
	}
	
	@GetMapping("/getEmployees")
	public ResponseEntity<List<EmployeeInfo>> getAllEmployees() {

		return new ResponseEntity<>(empService.getEmployees(), HttpStatus.OK);
	}
	
	@GetMapping("/saveEmployee")
	public String createEmployee(HttpServletRequest request)
	{
		String resp="";
		
		String ide=request.getParameter("ide");
		String name=request.getParameter("name");
		String addr=request.getParameter("addr");
		
		EmployeeInfo emp = new EmployeeInfo();
		
		emp.setEmpName(name);
		emp.setEmpAddr(addr);
		if(null!=ide && !ide.isEmpty())
		{
			emp.setEmpId(Integer.parseInt(ide));
		}
		
		empService.saveEmployee(emp);
		
		if(ide==null||ide.isEmpty()==true) {
		resp="Data Saved Successfully";
		}
		else {
			resp="Data Updated Successfully";
		}
		
		return resp;
	}
}
