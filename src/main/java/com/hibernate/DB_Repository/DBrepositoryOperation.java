package com.hibernate.DB_Repository;

import com.hibernate.Entities.Employee;

public interface DBrepositoryOperation {
	
	public Employee  getEmpDetail(int id);
	
	
	public Employee insertemployee(int id , String name , String address);
	
	
	public boolean deleteEmployee(int id);
	
		
	public Employee updateEmployee(int id,String name , String address);
	
	
}
