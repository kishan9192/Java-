package Noxml;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.jar.Attributes.Name;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration


public class JavaConfig {
	
// 1: This one is constructor injection. Uncomment to run	
	
//	@Bean
//	public Student getStudent() {
//		List<String> courses = new ArrayList<String>();
//		courses.add("Java");
//		courses.add("C/C++");
//		courses.add("Python");
//		courses.add("DSA");
//		return new Student("Kishan", 123, courses, getTest());
//	}
	

	
// This one is the setter injection, where we have used setter methods to initialize the values.	
	@Bean
	Student getStudent() {
		List<String>courses = new Vector<String>();
		courses.add("Docker");
		courses.add("Jenkins");
		courses.add("Selenium");
		courses.add("DevOps");
		
		Student obj = new Student();
		obj.setCourses(courses);
		obj.setId(100);
		obj.setName("ALOO");
		obj.setT(getTest());
		return obj;
	}
	
	
// Another Constructor injection, but this time for Test class.
	@Bean
	public Test getTest() {
		return new Test(3313);
	}
}
