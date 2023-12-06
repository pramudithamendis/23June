package pair;

public class Pair<T,U> {
	
	T i;
	U j;
	
	public Pair(T i, U j){
		this.i = i;
		this.j = j;
	}
	public T getFirst() {
		 
		
		return i;
		
	}
	
	public U getSecond() {

		return j;
		
	}
	
	
	public <T,U> void printFirst(T t, U u) {
		
		System.out.println("First stuff");
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating an object from the Pair generic class
		Pair<String, Integer> p = new Pair<>("Test 1", 42);

		//Creating an object from the Pair generic class
		Pair<Double, String> p2 = new Pair<>(3.14, "Test 2");

		
		//Printing the first object
		System.out.println("Printing the first pair, String-Integer");
		System.out.println("First value: "+ p.getFirst());
		System.out.println("Second value: "+ p.getSecond());
		
		System.out.println(" ");
		//Printing the second object		
		System.out.println("Printing the second pair, Double-String");
		System.out.println("First value: "+ p2.getFirst());
		System.out.println("Second value: "+ p2.getSecond());
		
		
		p.printFirst("Hi", 12);
		
		
	}

}
