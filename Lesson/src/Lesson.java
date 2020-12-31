
public class Lesson {
	
	private String name;
	
	//DEFAULT CONSTRUCTOR
	public Lesson() {
		
	}
	
	// PARAMETERIZED CONSTRUCTOR
	public Lesson(String n) {
		System.out.println("Parameterized Constructor");
		this.name = n;
	}
	
	// GETTER FUNCTION
	public String getName() {
		return name;
	}
	
	public int add(int x, int y) {
		return(x+y);
	}
	
	public static void print(String s) {
		System.out.println(s);
	}
	
	// THROWING EXCEPTIONS
	public int divide(int x, int y) throws IllegalArgumentException {
		if (y == 0) {
			throw new IllegalArgumentException("Can't divide by 0");
		}
		return (x/y);
	}
	
	
	// RECURSIVE FUNCTION
	public long factorial(int n) {
		if (n == 0) return 1;
		if (n == 1) return n;
		return (n*factorial(n-1));
	}
	
	
	// MAIN FUNCTION
	public static void main(String[] args) {
		
		Lesson obj = new Lesson("Kishan");
		String name = obj.getName();
		System.out.println(name);
		
		Lesson lu = new Lesson();
		int ans = lu.add(10,12);
		System.out.println(ans);
		Lesson.print("Hello World");
		
		int divans = lu.divide(4,2);
		System.out.println(divans);
		
		long factans = lu.factorial(20);
		System.out.println(factans);
		
		int divans2 = lu.divide(6,0);
		System.out.println(divans2);
	}

}
