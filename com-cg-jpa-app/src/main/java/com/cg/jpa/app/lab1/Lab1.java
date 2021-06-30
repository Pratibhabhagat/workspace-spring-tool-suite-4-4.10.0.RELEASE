package com.cg.jpa.app.lab1;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

//import com.cg.jpa.app.demo.Employee;

public class Lab1 {

	public static void main( String[] args )
    {
		System.out.println("Start");
    	System.out.println("Employee Details : ");
    	System.out.println("--------------------------");
		try {
			Configuration config = new Configuration();
			SessionFactory factory = config.configure().buildSessionFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			
			
//			Employee3 emp = new Employee3(12345,"Harriet",40000.0,"PES-BU",30);
//			session.save(emp); // insert
//			transaction.commit();
//			Employee3 e3;
//			e3 = session.get(Employee3.class, 40); // select
//			System.out.println(e3.toString());
//			session.evict(e3);
			
			SBU sb = new SBU("Pratibha Bhagat","Product");
			session.save(sb);
			
			Employee3 emp = new Employee3("Harriet",40000.0,"PES-BU",30,sb);
			session.save(emp);

			System.out.println(session.get(Employee3.class, emp.getEmployeeId()).toString());
			
			session.close();
			factory.close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("End");
    }
	
}
