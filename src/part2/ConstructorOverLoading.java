package part2;

public class ConstructorOverLoading {
	ConstructorOverLoading(int a, int b) { //1              //
		System.out.println(a + b);
	}

	ConstructorOverLoading(int a, double b) {//2           // over loading 
		System.out.println(a + b);
	}

	ConstructorOverLoading(double a, int b) {// 3         //   de 
		System.out.println(a + b);
	}

	ConstructorOverLoading(int a, int b, int c) { // 4   //    constructor
		System.out.println(a + b + c);
	}

	public static void main(String[] args) {
		//ConstructorOverLoading co = new ConstructorOverLoading(10, 20);
		ConstructorOverLoading co = new ConstructorOverLoading(10, 20, 30);
		//ConstructorOverLoading co = new ConstructorOverLoading(10.20, 50);
		//ConstructorOverLoading co = new ConstructorOverLoading(40, 50.10);
		
		

	}

}
