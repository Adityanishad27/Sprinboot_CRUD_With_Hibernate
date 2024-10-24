package com.hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import com.hibernate.DB_Repository.DBrepositoryOperation;
import com.hibernate.Entities.Employee;

public class insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ApplicationContext context=	SpringApplication.run(SpringbootWithHibernateApplication.class, args);

DBrepositoryOperation dbrepositoryOperation =context.getBean(DBrepositoryOperation.class);


	
	Employee emp= dbrepositoryOperation.insertemployee(122, "Adisssst","nalapar");
	
	if(emp != null) {
		
		System.out.println("insert Successfull");
		
	}
	else {
		System.out.println("Insert Failed");
	}
	

}

}
