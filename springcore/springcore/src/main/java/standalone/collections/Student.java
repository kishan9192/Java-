package standalone.collections;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Student {
	private List<String> friends;
	private Map<String, Integer> course;
	
	public List<String> getFriends() {
		return friends;
	}
	
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	
	public Map<String, Integer> getCourse() {
		return course;
	}
	
	public void setCourse(Map<String, Integer> course) {
		this.course = course;
	}
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(List<String> friends, Map<String, Integer> course) {
		super();
		this.friends = friends;
		this.course = course;
	}
	
	@Override
	public String toString() {
		return "Student []";
	}
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("standalone/collections/standaloneconfig.xml");
		Student obj = (Student) context.getBean("stud1");
		System.out.println(obj.getFriends() + " " + obj.getCourse());
		System.out.println(obj.getCourse().getClass().getName());
	}
}
