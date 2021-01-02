package autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Using this class for @annotation autowire

// Right now autowired annotation is used with all (constructor, setter method, property of address)
// Uncomment to check each of them one at a time. 
public class Student {
	private String name;
	private int id;
	
	@Autowired
	@Qualifier("address1")
	private Address address;
	
	@Autowired
	@Qualifier("address2")
	private Address address2;
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", address=" + address + "]";
	}

	//@Autowired
	public Student(Address address, Address address2) {
		super();
		this.address = address;
		this.address2 = address2;
		System.out.println("Constructor annotation autowire");
	}
	
	
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
		//this.address = address;
		//System.out.println("Constructor setting value");
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		
		return name;
	}

	public void setName(String name) {
		System.out.println("Setting name");
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Setting ID");
		this.id = id;
	}

	
	public Address getAddress() {
		return address;
	}

	
	public void setAddress(Address address) {
		System.out.println("Setting address");
		this.address = address;
	}
	
	public Address getAddress2() {
		return address2;
	}

	
	public void setAddress2(Address address2) {
		System.out.println("Setting address2");
		this.address2 = address2;
	}
	
	
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("autowire/annotationautowireconfig.xml");
		Student obj = (Student) context.getBean("stud");
		System.out.println(obj.getAddress().getStreet() + " " +obj.getAddress().getCity());
		System.out.println(obj.getAddress2().getStreet() + " " +obj.getAddress2().getCity());
		
	}
}
