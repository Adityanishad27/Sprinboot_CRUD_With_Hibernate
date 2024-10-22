package com.hibernate.Config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfig {
	
	
	public static SessionFactory getsSessionFactory() {
		
		Configuration cfg= new Configuration().configure("com/hibernate/resources/HibernateCfg.xml");
		
		return cfg.buildSessionFactory();
		
		
	}

}
