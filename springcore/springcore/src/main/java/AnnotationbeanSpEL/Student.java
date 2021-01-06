package AnnotationbeanSpEL;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// We will be using Annotations to set the values of variables 
// Component creates an object at runtime of the class, over which it is written. Here it is written above Student class therefore 
// it'll create the object "student" in CamelCase. we can also specify our own object name 
// like @Component("obj")

@Component("ob")
public class Student {
	@Value("Kishan Mishra")
	private String name;
	
	@Value("3195")
	private int id;
	
	// This is SpEL Spring Expression Language.
	@Value("#{temp}")
	private List<String>friends;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public Student(String name, int id, List<String> friends) {
		super();
		this.name = name;
		this.id = id;
		this.friends = friends;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
	
	
}
