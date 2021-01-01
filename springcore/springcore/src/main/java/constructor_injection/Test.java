package constructor_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Here we'll be using C schema for beans. It is same as p schema. Just replace p with c
public class Test {
	private int marks;
	Student stud;
	
	public Test(int marks, Student stud) {
		this.marks = marks;
		this.stud = stud;
	}

	@Override
	public String toString() {
		return (""+this.stud.getID() + " : " + this.stud.getname() + " : " + this.stud.getcourses() + " : " + this.marks);
	}
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("constructor_injection/constructorinjectionconfig.xml");
		Test obj = (Test) context.getBean("test");
		
		System.out.println(obj);
		
	}
	
	
	
}
