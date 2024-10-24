package com.hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import com.hibernate.DB_Repository.DBrepositoryOperation;

public class Delete {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(SpringbootWithHibernateApplication.class, args);
	
	
	DBrepositoryOperation  dbrepositoryOperation= context.getBean(DBrepositoryOperation.class);
	
boolean emp= dbrepositoryOperation.deleteEmployee(122);

if(emp==true) {
	System.out.println("Delete Successfully");
	
}
else {
	System.out.println("Deletion failed....User Not found ");
}

	}

}
