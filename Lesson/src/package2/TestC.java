package package2;
import packageA.TestB;
public class TestC {
	public static void main(String[] args) {
		
		new TestB().print();
		// Below statements give error, because functions other than public
		// of class belonging to other package are not accessible in this package's class.
		// Therefore only public functions of other package's public class TestB will be accessible
		//		new TestB().print2();
		//		new TestB().print3();
	}
}
