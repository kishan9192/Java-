import java.util.*;
public class loop {
	public static void main(String[] args) {
		String[] array = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
		for (String i: array) {
			// Println prints in new line
			// for same line use just print function
			System.out.println(i);
		}
		
		List<String>fruits = new ArrayList<>();
		fruits.add("Peach");
		fruits.add("Pomegranade");
		fruits.add("Guava");
		
		// Add a new line 
		System.out.println();
		
		for (String i : fruits) {
			// Space separated output
			System.out.print(i + "  ");
		}
		
		
		// ITERATING OVER 2D ARRAY
		int[][] arr= { {1,2,3}, {4,5,6}, {7,8,9} };
		int size = arr.length;
		for (int i = 0; i<size; i++) {
			System.out.println();
			for (int j =0; j<size; j++) {
				System.out.print(arr[i][j] + " ");
			}
			
		}
		System.out.println();
		
		
		// OTHER WAY OF DOING THIS
		for (int i = 0; i<arr.length; i++) {
			System.out.println();
			for (int j = 0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
		}
		
		
	}
}
