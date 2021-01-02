package beanlifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Annotationbean {
	Annotationtest testobj;
	
	public Annotationtest getTestobj() {
		return testobj;
	}

	public void setTestobj(Annotationtest testobj) {
		this.testobj = testobj;
	}

	
	@Override
	public String toString() {
		return "Annotationbean [testobj=" + testobj + "]";
	}
	

	// If we don't provide String[] args inside the main method
	// then eclipse runs a wrong file. inside the same default package
	public static void main(String[] args) {
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("beanlifecycle/annotationconfig.xml");
		Annotationbean obj = (Annotationbean) context.getBean("bean1");
		System.out.println(obj.getTestobj().getPrice());
		context.registerShutdownHook();
	}
}
