package part3;

class Parent {
	
	int a ;
	void display() {
		System.out.println(a);
	}
}
  
class child1 extends Parent{
	
	int x;
	void show() {
		System.out.println(x);
	}
}

class child2 extends Parent{
	
	int y;
	void print() {
		System.out.println(y);
	}
}
public class HierrarchicalInheritance {

	public static void main(String[] args) {
		
		child1 ch1 = new child1();
		ch1.a = 100;
		ch1.x = 30;
		ch1.display();
		ch1.show();
		
		child2 ch2 = new child2();
		ch2.a = 20;
		ch2.y = 10;
		ch2.display();
		ch2.print();

	}

}
