package StaticSpEL;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
	@Value("12")
	private int id;
	
	@Value("Yuvraj Singh")
	private String name;
	
	@Value("#{course}")
	private List<String>courses;
	
	// Static Method Spring Expression Language SpEL
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private double e;
	
	
	// Static variable Spring expression Language SpEL
	@Value("#{T(java.lang.Math).PI}")
	private double pi;

	
	

	public double getPi() {
		return pi;
	}

	public void setPi(double pi) {
		this.pi = pi;
	}

	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", courses=" + courses + ", e=" + e + ", pi=" + pi + "]";
	}

	public Student(double e, double pi) {
		super();
		this.e = e;
		this.pi = pi;
	}

	public double getE() {
		return e;
	}

	public void setE(double e) {
		this.e = e;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getCourses() {
		return courses;
	}

	public void setCourses(List<String> courses) {
		this.courses = courses;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int id, String name, List<String> courses) {
		super();
		this.id = id;
		this.name = name;
		this.courses = courses;
	}

	
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("StaticSpEL/config.xml"); 
		
		Student std = (Student) context.getBean("student", Student.class);
		
		System.out.print(std);
	}
	
}
