package part3;

class Bank {
	
	double interestRate() { // nom de methode
		return 0; // Body
	}
}

class SBI extends Bank{
	
	//same name
	double interestRate() {
		return 10.2;
		
	}
}

class ICICI extends Bank{
	double interestRate() {
		return 5.5;
	}
}

class AXIS extends Bank{
	double interestRate() {
		return 6.5;
	}

public class OverridingMethod {

	public static void main(String[] args) {
		
		SBI sbi = new SBI();
		System.out.println(sbi.interestRate());
		
		ICICI icici = new ICICI();
		System.out.println(icici.interestRate());
		
		AXIS axis = new AXIS();
		System.out.println(axis.interestRate());

		
		}
		
	}

}
