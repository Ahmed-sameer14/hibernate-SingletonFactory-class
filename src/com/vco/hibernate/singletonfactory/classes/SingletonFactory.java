package com.vco.hibernate.singletonfactory.classes;

import org.hibernate.*;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SingletonFactory 
{
	private static SessionFactory factory;
	
	private SingletonFactory()
	{
		System.out.println("inside singletonfactory()");
	}
	
	static
	{
		System.out.println("inside static block of singletonfactory....");
		Configuration config = new Configuration().configure();
		factory = config.buildSessionFactory();
	}
	
	public static SessionFactory getFactory()
	{
		return factory;
	}
}
