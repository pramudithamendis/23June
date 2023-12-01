package sims;

import java.util.ArrayList;
import java.util.Scanner;

public class Course {

	private String courseId;
	private String name;
	private String instructor;
	
//	Student s;
	
	
	ArrayList<Student> enrolled_students= new ArrayList<>();
	
	public Course() {
		super();
		this.courseId = "";
		this.name = "";
		this.instructor = "";
	}
	
	public void Read() {
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter cid");
		String co = s.nextLine(); 
		System.out.println("Enter cname");
		String n = s.nextLine();
		System.out.println("Enter instructor");
		String i = s.nextLine();
		
		
		
		setCourseId(co);
		setName(n);
		setInstructor(i);
		
		
	}
	
	
	
	public void Print() {

		System.out.println("cid is: " + getCourseId());
		System.out.println("cname is: "+ getName());
		System.out.println("instructor is:  "+ getInstructor());
		System.out.println("Enrolled students : ");
		
		for(Student w: enrolled_students) {
			System.out.println(w.getName());
		}
	}
	
	public void AddStudent(Student s) {
		enrolled_students.add(s);
	}
	
	
	
	
	

	//getters and setters
	public String getCourseId() {
		return courseId;
	}



	public String getName() {
		return name;
	}



	public String getInstructor() {
		return instructor;
	}



	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}



	public void setName(String name) {
		this.name = name;
	}



	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}







	public void setEnrolled_students(ArrayList<Student> enrolled_students) {
		this.enrolled_students = enrolled_students;
	}



	
	
	
	

	
	
}
