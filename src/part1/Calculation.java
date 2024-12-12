package part1;

public class Calculation {

	int x = 10;
	int y = 20;

	// 1/ case-1: Not tacking parametres and also not return any value

	void sum() { // void n'est pas return
		// body
		System.out.println(x + y);
	}

//			2/ case-2: Not tacking parametres but returning value

	int sum1() {
		return (x + y);
	}

//			3/ case-3: Tacking parameters but not returning value
	void sum2(int a, int b) {
		System.out.println(a + b);
	}

//			4/ case-4: Tacking parameters and also returning value
	int sum3(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		
		Calculation cal = new Calculation();
		cal.sum(); // case 1
		
		int res = cal.sum1(); // case 2
		System.out.println(res);
		
		cal.sum3(20, 50); // case 3

	}

}
