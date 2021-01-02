package beanlifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Test implements InitializingBean, DisposableBean {
	int x,y;

	public int getX() {
		return x;
	}

	public void setX(int x) {
		System.out.println("Setting x");
		this.x = x;
	}

	public int getY() {
		System.out.println("Setting y");
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "Test [x=" + x + ", y=" + y + "]";
	}

	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Test(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void init() {
		System.out.println("Inside init method");
	}
//	public void destroy() {
//		System.out.println("Inside destroy method");
//	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("Interface init method: Interface name = Initializing bean");
		
	}

	public void destroy() throws Exception {
		System.out.println("Interface lifecycle destroy method");
		
	}
}
