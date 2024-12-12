package part3;

class A {
	
	int a;
	void display() {
		System.out.println(a);
	}
}
 class B extends A{ // B is child class , A is parent class

	  int b;
	  void print() {
		  System.out.println(b);
	  }
 }
 
 class C extends B {
	  
	 int c;
	 void show() {
		 System.out.println(c);
	 }
 }

public class InheritanceExamples {

	public static void main(String[] args) {

		// Single
		A aobj = new A();
		aobj.a = 100;
		aobj.display();
		
		B bobj = new B();
		bobj.b = 200;
		bobj.a = 10;
		bobj.print();
		bobj.display();// display extends de A
		
		//Multilevel
		C cobj = new C();
		cobj.a = 30;
		cobj.b = 40;
		cobj.c = 50;
		cobj.display();
		cobj.print();
		cobj.show();
	}

}
