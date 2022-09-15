public class Q4 {
	// Aman Bhatt 19105013
	public static void main(String[] args) {
		
		// Q4 - Write a Java program to swap the values of integer number with using temporary variable and without using temporary variable.
		
		// Using Temp Variable
		int a = 5 , b = 10, temp;
		
		
		temp = a  ;
		a=b ; 
		b = temp ; 
		System.out.println("a after swapping = " + a);
		System.out.println("b after swapping " + b);
		
		System.out.println("-----------------------------------------------------------------------");
		
		
		// Without Using Temp 
		
		int x = 4, y = 10;
		
		x = x^y;
		y = x^y;
		x = x^y;

		System.out.println("x after swapping = " + x);
		System.out.println("y after swapping = " + y);
		
		
		
		
		
		
		
		
		

	}

}
