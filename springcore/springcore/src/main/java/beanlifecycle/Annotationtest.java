package beanlifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Annotationtest {
	private int price;

	@Override
	public String toString() {
		return "Annotationtest [price=" + price + "]";
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		System.out.println("Setting price");
		this.price = price;
	}

	public Annotationtest(int price) {
		super();
		this.price = price;
	}

	public Annotationtest() {	
		super();
		// TODO Auto-generated constructor stub
	}
	
	@PostConstruct
	public void start() {
		System.out.println("Start method");
	}
	
	@PreDestroy
	public void end () {
		System.out.println("End method");
	}
	
}
