package evenNumberRemover;

import java.util.ArrayList;

import java.util.ConcurrentModificationException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> numbers = new ArrayList<>();
	
		
		int no;
		Scanner s = new Scanner(System.in);
		
		//Getting the first ever user input
		System.out.println("enter a number");
		no = s.nextInt();
		while(no != 0) {
			
			//if the first ever user input is not 0, add it to the array list
			numbers.add(no);
			System.out.println("enter a number");
			
			//getting the next user input
			no = s.nextInt();
		}
		
		

		//removing the even numbers from the array list
		for(int i=0; i<numbers.size(); i++)	 {
			if(numbers.get(i)%2 == 0) {

				numbers.remove(i);
				
			}
			
		}
		
		
		

		
		//printing the odd number having array list
		System.out.print("Odd Numbers: ");
		System.out.println(numbers);

		
		
		
		
		
	}

}
