package constructor_injection;
import java.util.List;

public class Student {
	private int studentId;
	private String name;
	private List<String>courses;
	
	// Made these getter functions so that they can be used in
	// toString() function while printing the names and other details
	// Since all these fields are private in this class.
	String getname() {
		return this.name;
	}
	
	int getID() {
		return this.studentId;
	}
	
	List<String> getcourses() {
		return this.courses;
	}
	
	public Student(int id, String name, List<String>courses) {
		this.studentId = id;
		this.name = name;
		this.courses = courses;
	}
	
	
}
