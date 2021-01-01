package beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class beanclass {
	Test obj;
	
	public Test getObj() {
		return obj;
	}

	public void setObj(Test obj) {
		this.obj = obj;
	}

	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beanlifecycle/lifecycleconfig.xml");
		beanclass bj = (beanclass) context.getBean("tref");
		System.out.println("X = "+ bj.obj.getX());
		System.out.println("Y = "+ bj.obj.getY());
		
		context.registerShutdownHook();
		
	}
}
