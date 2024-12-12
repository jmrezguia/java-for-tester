package part5;

public class ExceptionExamples {

	public static void main(String[] args) {

		System.out.println("Program is started");
		System.out.println("Program is progress");

		// ArithmeticException

		int a = 10;
		try {
			System.out.println(a / 0);
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}

		// NullPointerException
		String s = null;
		try {
			System.out.println(s.length());
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

		// NumberFormatException
		String x = "abc";
		try {
			int i = Integer.parseInt(x);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}

		// ArrayIndexOutOfBoundsException
		int arr[] = new int[5];
		try {
			arr[10] = 100;
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}

		System.out.println("Program is compiler");
		System.out.println("Program is exited");
	}

}
