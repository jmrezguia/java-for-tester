package part1;

public class ConstructorDemo {

	int x;
	int y;
	
	// Default constructor
	ConstructorDemo() {
		x = 10;
		y = 20;
	}
	
	//Parametrized constructor
	ConstructorDemo(int a, int b){
		x = a;
		y= b;
	}
	 void display() {
		 System.out.println(x + y);
	 }
	
	
	
	public static void main(String[] args) {
		
//		ConstructorDemo cd = new ConstructorDemo();// invoke Default instructor 
//		cd.display();
		
		ConstructorDemo cd = new ConstructorDemo(200,  300); // invoke Parametrized constructor
		cd.display();
		
		// if calling the 2 constructor (default + parametrized)
		ConstructorDemo cd1 = new ConstructorDemo();
		ConstructorDemo cd2 = new ConstructorDemo(200,400);
		cd1.display();
		cd2.display();
		
		
		

}

}