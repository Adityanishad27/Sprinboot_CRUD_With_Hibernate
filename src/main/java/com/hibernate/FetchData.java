package com.hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import com.hibernate.DB_Repository.DBrepositoryOperation;
import com.hibernate.Entities.Employee;

public class FetchData {
	public static void main(String[] args) {
		
		
		
		ApplicationContext context=	SpringApplication.run(SpringbootWithHibernateApplication.class, args);
		
		
	
		DBrepositoryOperation dBrepositoryOperation= context.getBean(DBrepositoryOperation.class);
		
	Employee emp=dBrepositoryOperation.getEmpDetail(5);  


	if(emp != null) {
		
		System.out.println(emp.getEmpId());
		System.out.println(emp.getEmpName());
		System.out.println(emp.getEmpAddress());
		
	}
	else {
		System.out.println("user not found");
	}
			
			
			
			
		}
	}


