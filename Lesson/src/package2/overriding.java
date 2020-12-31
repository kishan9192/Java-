package package2;
class Parent {
	public void show(String s) {
		System.out.print("Base" + s);
	}
}

class Child extends Parent {
	// This function is overridden successfully
	public void show(String s) {
		System.out.print("Child" + s);
	}
	
	// But if we change the signature, then it is not overridden
	public void show(Object s) {
		System.out.print("Object "+ s);
	}
}
public class overriding {
	public static void main(String args[]) {
		Child obj = new Child();
		String s = new String("Hello");
		obj.show(s);
	}
	
}
