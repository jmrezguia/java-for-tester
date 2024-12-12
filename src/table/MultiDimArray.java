package table;

public class MultiDimArray {

	public static void main(String[] args) {

		
		int a[][] = new int[3][2];

		a[0][0] = 100;
		a[0][1] = 200;

		a[1][0] = 300;
		a[1][1] = 400;

		a[2][0] = 500;
		a[2][1] = 600;

		// m2
		// int a[][] = {{100, 200}, {200,300},{400,500},{500,600}};

		System.out.println("Number of rows:" + a.length);          
		System.out.println("Number of columns:" + a[0].length);

		// m3
		for (int i = 0; i < a.length; i++) {                 //        
			for (int j = 0; j < a[i].length; j++) {          //       Boucle imbriqué
				System.out.println(a[i][j]);                //
			}                                              //            (i): compte NB ligne
		}                                                 //             (j): compte NB colonne

		// m4
		// Enhanced for loop

		for (int r[] : a) {
			for (int i : r) {
				System.out.println(i);
			}
		}

	}

}
