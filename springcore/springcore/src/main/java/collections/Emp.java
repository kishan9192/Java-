package collections;
import java.util.*;

public class Emp {
	private String empName;
	private List<String> phone;
	private Map<String, String>course;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public List<String> getPhone() {
		return phone;
	}
	public void setPhone(List<String> phone) {
		this.phone = phone;
	}
	public Map<String, String> getCourse() {
		return course;
	}
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
	
	public Emp(String empName, List<String> phone, Map<String, String> course) {
		super();
		this.empName = empName;
		this.phone = phone;
		this.course = course;
	}
	
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {
		return "Emp [empName=" + empName + ", phone=" + phone + ", course=" + course + "]";
	}
	
	
}
