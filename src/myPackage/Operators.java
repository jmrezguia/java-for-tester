package myPackage;

public class Operators {

	public static void main(String[] args) {
		
		int a = 20;
		int b = 10;
		
		// Arithmetic operators ===> + - *
		System.out.println("------------ Arithmetic Operators------------");
		System.out.println("Sum of a and b is :" +(a+b));
		System.out.println("Diff of a and b is :" +(a-b));// Without () will do concat
		
		 // Relational Operators ==> == <> <=  >= !=
		// Always Return Boolean Value
		System.out.println("-------------Relational Operators-------------"); 
		System.out.println(a == b);// false 20 = 10
		System.out.println(a > b);// true  20 > 10
		System.out.println(a < b);// false 20 < 10
		System.out.println(a != b);// true 20 # 10
		
		// Logical Operators & || !
		System.out.println("-------------Logical Operators-----------------");
		boolean x = true;// 1
		boolean y = false;// 0
		System.out.println(x && y);// false x * y
		System.out.println(x || y);// true  x + y
		System.out.println(! x);// false (not x)
		System.out.println(! y);// true  (not y)
		
		// Increment/ Decrement Operators
		System.out.println("--------------Increment / Decrement Operators------------");
		a = 20;
		a++;
		System.out.println(a);
	    b = 10;
		b--;
		System.out.println(b);
		  
		
	}

}
