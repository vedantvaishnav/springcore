package com.springcore.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("Config.xml");
        
        StudentMain student1= (StudentMain)context.getBean("student1");
       StudentMain student2=(StudentMain) context.getBean("student2");
        System.out.println(student1);
        System.out.println(student2);
        System.out.println("Hello GitHub from Eclipse!");

        
        
    }
}
