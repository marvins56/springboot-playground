package com.example.practise.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long Dept_id;
	private String Dept_Address;
	private String Dept_Name;
	private String Dept_code;
	
	
	
	
	@Override
	public String toString() {
		return "Department [Dept_id=" + Dept_id + ", Dept_Address=" + Dept_Address + ", Dept_Name=" + Dept_Name
				+ ", Dept_code=" + Dept_code + "]";
	}

	public Department() {
		super();
	}

	public Department(int dept_id, String dept_Address, String dept_Name, String dept_code) {
		super();
		Dept_id = dept_id;
		Dept_Address = dept_Address;
		Dept_Name = dept_Name;
		Dept_code = dept_code;
	}

	public long getDept_id() {
		return Dept_id;
	}
	
	public void setDept_id(int dept_id) {
		Dept_id = dept_id;
	}
	public String getDept_Address() {
		return Dept_Address;
	}
	public void setDept_Address(String dept_Address) {
		Dept_Address = dept_Address;
	}
	public String getDept_Name() {
		return Dept_Name;
	}
	public void setDept_Name(String dept_Name) {
		Dept_Name = dept_Name;
	}
	public String getDept_code() {
		return Dept_code;
	}
	public void setDept_code(String dept_code) {
		Dept_code = dept_code;
	}
	
	

}
