package com.cg.jpa.app;
import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("Start");
		try {
			Configuration config = new Configuration();
			SessionFactory factory = config.configure().buildSessionFactory();
			Session session = factory.openSession();
			Transaction transaction = session.beginTransaction();
			
			//Department dep = new Department("HR","Pune");
			Employee2 emp = new Employee2("Sonu", 10.5);
			session.save(emp); // insert
			transaction.commit();
			Employee2 e1;
			e1 = session.get(Employee2.class, 5); // select
			System.out.println(e1.toString());
			session.evict(e1);
			e1.setName("Monu");
//			session.update(e1); // update
//			e1 = session.get(Employee.class, 101);
//			System.out.println(e1.toString());
//			session.delete(e1); // delete
//			e1 = session.get(Employee.class, 101);
//			System.out.println(e1.toString());
			session.close();
			factory.close();
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		System.out.println("End");
    }
}
