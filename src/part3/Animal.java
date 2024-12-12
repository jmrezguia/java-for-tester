package part3;
//1
public class Animal {
	
	String color = "White";
	//2
	void eating() {
		System.out.println("Eating.............");
	}

	Animal(){// constructor
		System.out.println("Animal is created");
	}
}

class Dog extends Animal{
	
	//We can also call this overring - different Body
	String color = "Black";
	 
	Dog(){
		System.out.println("Dog is created");
	}
	void displayColor() {
		System.out.println(color);
	}
	
	void eating() {
		System.out.println("Eating Bread.............");
	}
}
