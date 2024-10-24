package com.hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import com.hibernate.DB_Repository.DBrepositoryOperation;
import com.hibernate.Entities.Employee;

public class Update {
	public static void main(String[] args) {
		ApplicationContext context=	SpringApplication.run(SpringbootWithHibernateApplication.class, args);
		
		DBrepositoryOperation dBrepositoryOperation= context.getBean(DBrepositoryOperation.class);
		
		Employee emp= dBrepositoryOperation.updateEmployee(122, "namrtutu", "kererurakat");
		
		if(emp != null) {
			
			System.out.println("Updated Successfully");
			
		}
		else {
			System.out.println(" User Not found  ....Failed");
		}
		
		
		
	}

}
