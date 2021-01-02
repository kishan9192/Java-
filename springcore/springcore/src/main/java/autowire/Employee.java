package autowire;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Employee {
	private String name;
	private int id;
	Address address;
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", address=" + address + "]";
	}

	public Employee(String name, int id, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}

	public Employee() {
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

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("autowire/autowireconfig.xml");
		Employee emp = (Employee) context.getBean("employee2");
		System.out.println(emp.getName() + " " + emp.getId() + " " + emp.getAddress().getCity() + " " + emp.getAddress().getStreet());
	}
}
