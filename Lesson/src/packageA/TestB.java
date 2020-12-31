package packageA;

// Class TestA was a default class in the same package
public class TestB {
	public void print() {
		System.out.println("Public Print function of class TESTB");
	}
	protected void print2() {
		System.out.println("Protected Print function of class TESTB");
	}
//	private void print3() {
//		System.out.println("Private Print function of class TESTB");
//	}
	
	public static void main(String[] args) {
		new TestA().publicmethod();
		//new TestA().privatemethod();
		new TestA().defaultmethod();
		new TestA().protectedmethod();
	}
	
	
	
}