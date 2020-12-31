package com.springcore.springcore;

// This class is a bean which is holding the data. Bean is a normal java class.
public class Student {
	private String studentName;
	private String studentAddress;
	private int studentId;
	
	// Getters and Setters
	public String getStudentName() {
		// Just to verify setter injection is being called.
		System.out.println("Inside get Student");
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	// Parameterized constructor (using Source option)
	public Student(String studentName, String studentAddress, int studentId) {
		super();
		this.studentName = studentName;
		this.studentAddress = studentAddress;
		this.studentId = studentId;
	}
	
	// Default constructor (using Source option)

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// toString() method for printing the object's fields (using Source option)
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", studentAddress=" + studentAddress + ", studentId=" + studentId
				+ "]";
	}
	
	
	
	
	
	

}
