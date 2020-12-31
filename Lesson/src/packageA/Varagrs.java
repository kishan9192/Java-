package packageA;
import java.util.*;
public class Varagrs {
	// These arguments passed in the main function will be collected here in the array
	public int add (int ... n) {
		int sum = 0;
		for (int i : n) {
			sum += i;
		}
		return sum;
	}
	
	// FUNCTION TO ADD VARIABLE NUMBER OF ELEMENTS IN AN ARRAY
	public int[] insert(int[] arr, int ...n) {
		int size = arr.length;
		int size2 = n.length;
		int[] temparr = new int[size+size2];
		int i;
		for (i = 0; i<size; i++) {
			temparr[i] = arr[i];
		}
		
		for (int j:n) {
			temparr[i++] = j;
		}
		
		return temparr;
	}
	public static void main(String[] args) {
		Varagrs obj = new Varagrs();
		// Can pass any number of arguments here.
		int ans = obj.add(4,5,77,4,8,6,88,2,51,56,7);
		int ans2 = obj.add(1,11);
		System.out.println(ans);
		System.out.println(ans2);
		
		//ADDING ELEMENTS IN AN ARRAY
		int []arr = {1,2,4};
		arr = obj.insert(arr, 3,5,6);
		System.out.println();
		for (int i:arr) {
			System.out.print(i+" ");
		}
		
		
		// SORTING THE ARRAY
		Arrays.sort(arr);
		System.out.println();
		for (int i:arr) {
			System.out.print(i+" ");
		}
		
		
		String[] strarr = new String[] {"1", "2", "3", "4"};
		String str = Arrays.toString(strarr);
		System.out.println(str);
	}
}
