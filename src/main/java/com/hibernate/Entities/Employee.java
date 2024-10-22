package com.hibernate.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int EmpId;
	private String EmpName;
	private String EmpAddress;
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getEmpAddress() {
		return EmpAddress;
	}
	public void setEmpAddress(String empAddress) {
		EmpAddress = empAddress;
	}
	public Employee(int empId, String empName, String empAddress) {
		super();
		EmpId = empId;
		EmpName = empName;
		EmpAddress = empAddress;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [EmpId=" + EmpId + ", EmpName=" + EmpName + ", EmpAddress=" + EmpAddress + "]";
	}
	
	
	
	
	

}
