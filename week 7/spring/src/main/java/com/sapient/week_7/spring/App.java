package com.sapient.week_7.spring;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext factory = new ClassPathXmlApplicationContext("/home/krishna/projects/ps/spring/src/main/java/com/sapient/week_7/spring/xmlContain.xml");
    	emp_pojo emp1 = (emp_pojo)factory.getBean("emp1");
    	System.out.println(emp1);
    	
    	Scanner sc = new Scanner(System.in);
    	String Id = sc.next();
    	
    	emp_pojo emp2 = (emp_pojo)factory.getBean(Id);
    	System.out.println(emp2);
    	sc.close();
    	
    	ApplicationContext fact = new AnnotationConfigApplicationContext(JavaContainer.class);
    	emp_pojo emp3 = (emp_pojo)fact.getBean("emp3");
    	System.out.println(emp3);
    	
    }
}
