
import java.util.*;

public class STACK {
	public static void main(String[] args) {
		Stack<Integer> st = new Stack<Integer>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		// PRINT STACK
		System.out.println(st);
		
		
		// STACK TOP
		System.out.println(st.peek());
		
		st.pop();
		System.out.println(st.peek());
		
		// ITERATOR TRAVERSE OVer tHE ARRAY
		Iterator<Integer>itr = st.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next() + " ");
		}
		
		System.out.println();
		
		System.out.println("The position of 3 is " + st.search(3));
		
		System.out.println("Is the stack empty ? "+ st.empty());
		
	}
}
