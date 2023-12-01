package sims;

import java.util.Scanner;

public class Student {

	private String StudentId;
	private String name;
	private String address;
	private String contact_number;
	
	public Student() {
		super();
		this.StudentId = "";
		this.name = "";
		this.address = "";
		this.contact_number = "";

	}
		
	public void Read() {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter sid");
		String st = s.nextLine();
		System.out.println("Enter name");
		String n = s.nextLine();
		System.out.println("Enter address");
		String a = s.nextLine();
		System.out.println("Enter contact number");
		String c = s.nextLine();
		
		
		setStudentId(st);
		setName(n);
		setAddress(a);
		setContact_number(c);
		
		
//		this.StudentId =st;
//		this.name = n;
//		this.address = a;
//		this.contact_number = c;
		
	} 
	
	public void Print() {
		System.out.println("Student id is: " + getStudentId());
		System.out.println("Student Name is: "+ getName());
		System.out.println("Student ADdress is:  "+ getAddress());
		System.out.println("Student Telephone is: "+ getContact_number());
		System.out.println("");
		

	}
	
	
	
	
	//getters and setters
	public String getStudentId() {
		return StudentId;
	}




	public void setStudentId(String studentId) {
		StudentId = studentId;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getAddress() {
		return address;
	}




	public void setAddress(String address) {
		this.address = address;
	}




	public String getContact_number() {
		return contact_number;
	}




	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}




	
	
	
	public static void main(String args[]) {
		
		

	}
	
}
