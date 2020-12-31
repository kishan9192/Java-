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
        
        // Student st = new Student(); This is tight coupling which we want to avoid
        
        // Follow documentation instantiating context from spring 5 documentation
        
       ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
       Student student = (Student) context.getBean("Student");
       
       // This bean is declared in config.xml using p schema
       Student student2 = (Student) context.getBean("Student2");
       System.out.println(student);
       System.out.println(student2);
    }
}
