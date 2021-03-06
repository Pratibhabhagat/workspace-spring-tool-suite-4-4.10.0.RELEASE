package com.cg.spring.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "start" );
        
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
        
		Employee emp = context.getBean("employee", Employee.class);
		System.out.println(emp.toString());

//		Employee emp2 = context.getBean("employee2", Employee.class);
//		System.out.println(emp2.getEname());
//
//		Employee emp3 = context.getBean("employee3", Employee.class);
//		System.out.println(emp3.toString());
//
//		Employee emp4 = context.getBean("employee4", Employee.class);
//		System.out.println(emp4.toString());

		emp.work();
		System.out.println("End");
		((AbstractApplicationContext) context).close();
    }
}
