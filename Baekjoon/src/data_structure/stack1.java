package data_structure;

import java.util.*;

public class stack1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> stack = new Stack<>();
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		for(int i = 0; i<n; i++) {
			String str = in.next();
			
			switch(str) {
			
			case "push":
				int item = in.nextInt();
				stack.push(item);
				break;
			case "pop":
				System.out.println(stack.isEmpty() ? -1 : stack.pop());
				break;
			case "size":
				System.out.println(stack.size());
				break;
			case "empty":
				System.out.println(stack.isEmpty() ? 1 : 0);
				break;
			case "top":
				System.out.println(stack.isEmpty() ? -1 : stack.peek());
				break;
			}
		}
	}
}
