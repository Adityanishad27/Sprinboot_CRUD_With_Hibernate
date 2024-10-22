package com.hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.context.ApplicationContext;

import com.hibernate.DB_Repository.DBOperationImplement;
import com.hibernate.DB_Repository.DBrepositoryOperation;
import com.hibernate.Entities.Employee;

public class Delete {

	public static void main(String[] args) {
	ApplicationContext context=	SpringApplication.run(SpringbootWithHibernateApplication.class, args);
	
	
	DBrepositoryOperation  dbrepositoryOperation= context.getBean(DBrepositoryOperation.class);
	
Employee emp= dbrepositoryOperation.deleteEmployee(4);

if(emp==null) {
	System.out.println("Delete Successfull");
	
}
else {
	System.out.println("Deletion failed");
}

	}

}
