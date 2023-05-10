package com.example.practise.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.practise.entity.Department;
import com.example.practise.service.DepartmentService;

@RestController
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;

	// save department
	//requestbody helps convert to json object the data from the department
	@PostMapping("/department")
	public Department saveDepartment ( @RequestBody Department department ) {

		 
		return departmentService.saveDepartment(department);
		
	}

}
