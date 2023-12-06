package pair;

import java.util.*;

public class Pair<T,U, W extends Number ,X,A> {
	
	T t;
	U u;
	W w;
	X x;
	A a;
	
	
	//K = We can't do the following
//	List<T, U, W> list = new ArrayList<>();
	
	
	
	public Pair(T t, U u, W w, X x, A a){
		this.t = t;
		this.u = u;
		this.w = w;
		this.x = x;
		this.a = a;
		list.add(t,u,w);
	}
	public T getFirst() {
		 
		
		return t;
		
	}
	
	public U getSecond() {

		return u;
		
	}
	
	
	public void printFirstTwo() {
		System.out.println(t+"-"+u);
	}
	

	public void printOther3() {
		System.out.println(w + "-"+ x + "-"+ a);
	}

	public <T,U> void printFirstTwoNew(T t, U u) {
		
		System.out.println(t +" "+ u);
	
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating an object from the Pair generic class
		Pair<String, Integer, Integer, Integer, Integer> p = new Pair<>("Test 1", 42, 1,2,3);

		//Creating an object from the Pair generic class
		Pair<Double, String, Integer, Integer, Integer> p2 = new Pair<>(3.14, "Test 2", 4,5,6);

		
		//Printing the first object
		System.out.println("Printing the first pair, String-Integer");
		System.out.println("First value: "+ p.getFirst());
		System.out.println("Second value: "+ p.getSecond());
		
		System.out.println(" ");
		//Printing the second object		
		System.out.println("Printing the second pair, Double-String");
		System.out.println("First value: "+ p2.getFirst());
		System.out.println("Second value: "+ p2.getSecond());
		
		
		
		System.out.println("");
		p.printFirstTwo();
		p2.printFirstTwo();
				
		System.out.println("");
		p.printOther3();
		p2.printOther3();
		
		System.out.println("");
		p.printFirstTwoNew("Hi", 12);
		p2.printFirstTwoNew(1.2, "Hi");
	}

}
