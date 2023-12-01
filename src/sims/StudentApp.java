package sims;

import java.util.ArrayList;

public class StudentApp {

	public static void main(String[] args) {
		
		//Creating student objects
		Student s = new Student();
		s.Read();

		Student s2 = new Student();
		s2.Read();

		
		
//		ArrayList<Student> students = new ArrayList<>();
//		students.add(s);
//		students.add(s2);
		
		
		//Creating course objects
		Course c = new Course();
		c.Read();
			//Adding students to the course
		c.AddStudent(s);
		c.AddStudent(s2);
		
		Course c2 = new Course();
		c2.Read();
			//Adding students to the course	
		c2.AddStudent(s2);
		
		
		
		//Adding students to an ArrayList
		ArrayList<Student> studentlist = new ArrayList<>();
		studentlist.add(s);
		studentlist.add(s2);
		
		ArrayList<Course> courselist = new ArrayList<>();
		courselist.add(c);
		courselist.add(c2);
		
		
		//Printing the arraylist of student
		System.out.println("Student Information");
		for(Student w: studentlist) {
		w.Print();
		
		}
		
		

		//Printing the arraylist of student
		System.out.println("Course information");
		for(Course w: courselist) {
		w.Print();
		
		}
		
		
		
	
		
		
		
	}

}

