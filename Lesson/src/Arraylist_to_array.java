import java.util.*;
public class Arraylist_to_array {
	public static void main(String[] args) {
		List<Integer>l1 = new ArrayList<Integer>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		
		// ARRAYLIST TO ARRAY
		Integer[] arr = new Integer[l1.size()];
		arr = l1.toArray(arr);
		for (int i:arr) {
			System.out.println(i);
		}
		
		
		// ARRAY TO ARRAYLIST
		System.out.println();
		List<Integer>list2 = new ArrayList<Integer>(Arrays.asList(arr));
		for (int i:list2) {
			System.out.print(i+ " ");
		}
		// Even if we modify this list, it works fine.
		list2.add(555);
		list2.add(556);
		list2.add(557);
		list2.add(558);
		System.out.println();
		for (int i:list2) {
			System.out.print(i+ " ");
		}
		
		
	}
}
