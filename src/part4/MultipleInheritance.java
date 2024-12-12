package part4;

interface ABC {

	int abc = 100;

	void m1();
}

interface HNF {

	int hnf = 200;

	void m2();
}

public class MultipleInheritance implements ABC, HNF {

	public void m1() {
		System.out.println(abc);
	}

	public void m2() {
		System.out.println(hnf);
	}

	public static void main(String[] args) {
		MultipleInheritance mi = new MultipleInheritance();
		mi.m1();
		mi.m2();

	}

}
