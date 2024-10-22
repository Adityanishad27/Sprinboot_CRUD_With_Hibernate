package com.hibernate.DB_Repository;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.hibernate.Config.HibernateConfig;
import com.hibernate.Entities.Employee;


@Repository
public class DBOperationImplement implements DBrepositoryOperation{

	
	
	//Fetch
	@Override
	public Employee getEmpDetail(int  id) {
		Employee   emp =null;
		
		
		try ( Session session = HibernateConfig.getsSessionFactory().openSession()
				)
		
		{
			emp= session.get(Employee.class, id);
			
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return emp;
		
	}
	
	// Insert

	@Override
	public Employee  insertemployee(int id, String name, String address) {
		
		
		try(Session session = HibernateConfig.getsSessionFactory().openSession()) {
			
	
			
			Employee emp1 = new Employee();
			
			emp1.setEmpId(id);
			emp1.setEmpName(name);
			emp1.setEmpAddress(address);
			
			Transaction tx = session.beginTransaction();
			session.save(emp1);
			
			tx.commit();
			
			session.close();
			
			
			
		} 
		
		catch (Exception e) {
			e.printStackTrace();
		}
		
	return null;
		
	}
	
	//Delete

	@Override
	public Employee deleteEmployee(int id) {
	Employee empp = null;
	
		try(Session session = HibernateConfig.getsSessionFactory().openSession()) {
			
			Transaction tx= session.beginTransaction();
			
			
			Employee emp= new Employee();
			emp.setEmpId(id);
			
			session.delete(emp);
			
			tx.commit();
			session.close();
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return empp;
		
	}

	//Update 
	@Override
	public Employee updateEmployee(int id , String name , String address) {
		
		
            Employee   emp =null;
		
		
		try ( Session session = HibernateConfig.getsSessionFactory().openSession()
				)
		
		{
			
			Transaction tx= session.beginTransaction();
			emp= session.get(Employee.class, id);
			
		 emp.setEmpName( name);
		 
		 emp.setEmpAddress(address);
			
		 session.saveOrUpdate(emp);
		 tx.commit();
		 session.close();
		 
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return emp;
		
	
		
		
	}



}
		
	
	
