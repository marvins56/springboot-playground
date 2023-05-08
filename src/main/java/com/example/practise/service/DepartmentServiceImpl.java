package com.example.practise.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.practise.entity.Department;
import com.example.practise.repository.DepartmentRepository;

@Service
public class DepartmentServiceImpl implements DepartmentService  {
@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		
		return departmentRepository.save(department);
	}

}
