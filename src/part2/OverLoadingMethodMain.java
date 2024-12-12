package part2;

public class OverLoadingMethodMain {
	
	//Multiple main method
	public void main(int x) {
		System.out.println(x);
	}
	
	public void main(int x , int y) {
		System.out.println(x + y );
	}

	public static void main(String[] args) {
		OverLoadingMethodMain omm = new OverLoadingMethodMain();
		omm.main(10);
		omm.main(50, 60);
	}

}
