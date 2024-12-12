package table;

public class SingleDimArray {

	public static void main(String[] args) {

		//int a[] = new int[5]; // Declare array with size 5; starting index is 0; last index 4

		// m1
		// Storing / inserting values into array

		//a[0] = 100;
		//a[1] = 200;
		//a[2] = 300;
		//a[3] = 400;
		//a[4] = 500;

		// m2
		// Declare array without specifying size
		int a[] = { 100, 200, 300, 400, 500 };
		//System.out.println(" Lentgh an of array is:" + a.length);

		// Read specific value
		//System.out.println(a[2]); // Result = 300

		// m3
		//for (int i = 0; i < a.lentgh; i++) {
		//	System.out.println(a[i]);
		//}

		// m4
		// Read value using enhanced for loop
		
		for (int i : a) {
			System.out.println(i);
		}

	}
}
