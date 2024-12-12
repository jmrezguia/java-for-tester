package part5;

public class CheckedExceptionExample {

	public static void main(String[] args) throws InterruptedException { // m1

		System.out.println("Program is started");
		System.out.println("Program is progress");

		Thread.sleep(3000); // Exception

//m2
		// try {
		// Thread.sleep(3000);
		// } catch (InterruptedException e) {
		// TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		System.out.println("Program is compiler");
		System.out.println("Program is exi" + "");
	}

}
