package part2;

public class StaticExamples {
	
	static int a = 10; // static variable
	int b = 20; // non static variable

	static void m1() { // static method
		System.out.println("This is m1 - static method");
		
		// Access to variable b directly - non static
		// creat object
		StaticExamples se = new StaticExamples();
		System.out.println(se.b);
	}  

	void m2() {
		System.out.println("This is  - non static method");
		
	}
	 
	void m3() {
		System.out.println("This is m3 - non static method");
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
		
	}
	public static void main(String[] args) {
		
		// static method can access only staff directly ==> without create an object
       System.out.println(a);
       System.out.println(StaticExamples.a);// By class name (autre methode pour afficher a sans creation d'object)
	
       m1();
       StaticExamples.m1();// By class name (autre methode pour afficher m1 sans utilise la methode de creation d'object)
       
      // System.out.println(b); // incorrect, because b is not static variable
	  // m2(); // incorrect because b is not static method
       
       //static method can also access non static staff but through object
       StaticExamples se = new  StaticExamples();
       System.out.println(se.b);
       
       se.m2();
       se.m3();
	}
	

}
