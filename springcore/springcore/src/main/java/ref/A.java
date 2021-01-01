package ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class A {
	// Since class A is dependent on class B's object
	// Therefore in config file we need to specify configurations/ set values
	// for class B before setting A's.
	
	private int x;
	private B ob;
	
	
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public B getOb() {
		return ob;
	}


	public void setOb(B ob) {
		this.ob = ob;
	}

	

	@Override
	public String toString() {
		return "A [x=" + x + ", ob=" + ob + "]";
	}

		

	public A() {
		super();
		// TODO Auto-generated constructor stub
	}


	public A(int x, B ob) {
		super();
		this.x = x;
		this.ob = ob;
	}


	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("ref/refconfig.xml");
		//A object = (B)context.getBean("bref");
		A obj2 = (A)context.getBean("aref");
		System.out.println(obj2);
		
		// To print the value of B's properties
		// we need to call them using the object
		System.out.println(obj2.getOb().getY());
		
		
		A pschematype = (A)context.getBean("aref3");
		System.out.println("Value of x in pschema bean = " + pschematype.getX());
	}

}