package conditionalStatements;

public class HomeWorkSwitchcASE {

	public static void main(String[] args) {

		String  saison="hiver";
		switch (saison) {
		case "hiver":
			System.out.println("decembre");
			System.out.println("janvier");
			System.out.println("fevrier");
			break;
		case "printemp":
			System.out.println("mars");
			System.out.println("avril");
			System.out.println("mai");
			break;
		case "été":
			System.out.println("juin");
			System.out.println("juillet");
			System.out.println("aout");
			break;
		case "Automne":
			System.out.println("Septembre");
			System.out.println("Octobre");
			System.out.println("Nouvembre");
			break;
			
			default :
				System.out.println("name is not valide");
		}
	}

}
