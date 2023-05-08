package com.example.practise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.practise.entity.Department;

@Repository
public interface DepartmentRepository  extends JpaRepository<Department,Long>{

}
