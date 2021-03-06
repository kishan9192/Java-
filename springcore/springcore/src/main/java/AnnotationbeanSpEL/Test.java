package AnnotationbeanSpEL;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("AnnotationbeanSpEL/config.xml");
		
		// Since we don't have a bean, here instead of bean we specify the name of the object that Component will create
		// If we're not sure of the name Component is going to create, we can specify the name inside Component("object")
		// and use that same name here inside getBean("object")
		
		Student obj = (Student) context.getBean("ob", Student.class); 
		System.out.print(obj);
	}
}