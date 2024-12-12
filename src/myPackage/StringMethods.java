package myPackage;

public class StringMethods {

	public static void main(String[] args) {
		String s ="             welcome";
		String s1 = "to java";
		 
		//length of a string
		System.out.println(s.length());
		 
		//joining of the string
		System.out.println(s.concat(s1));
		
		// trimming the string
		System.out.println("before trimming string s is:"+s);
		
		//remove space
		System.out.println("after trimming string s is:"+s.trim());
		
		//CharArt()
	     s= "welcome";
		System.out.println(+s.charAt(3));
		
		//contains ==> Return boolean
		System.out.println(s.contains("wel"));
		System.out.println(s.contains("come"));
		
		//comparing string
		s= "welcome";
		System.out.println(s.equals("welcome"));// comparaison caractére par caractére
		System.out.println(s.equals("Welcome"));
		System.out.println(s.equals("wel   com"));
		
		//replacing characters
		s = "welcome to java";
		System.out.println(s.replace('o','i'));
		System.out.println(s.replace("java", "selenuim"));
		
		//converting string
		s= "WELCOME";
		System.out.println(s.toLowerCase());// metre s en miniscule
		s= "welcome";
		System.out.println(s.toUpperCase());// metre s en majuscule
	}

}
