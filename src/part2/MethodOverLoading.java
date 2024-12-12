package part2;

public class MethodOverLoading {
	 // same name of method - different parameters
	void add(int a , int b) { // 1                       //
		System.out.println(a + b);                       //
	}
	 void add(int a, double b) { // 2                    //
		 System.out.println(a + b);                      //           creation de class
	 }                                                                   
	 void add(double a ,double b) { // 3                //             de over loading
		 System.out.println(a + b);                     //
		 
	 }
	 void add(int a , int b , int c) { // 4            //
		 System.out.println(a + b + c);                //
		 
	 }

	public static void main(String[] args) {
		MethodOverLoading mo = new  MethodOverLoading();            //
		mo.add(10, 20);                                            //          creation d'object 
		mo.add(20, 80.30);                                         //           de over loading
		mo.add(30.20, 40.10);                                     //
		mo.add(20, 30, 50);                                       //
		
	}
	

}
