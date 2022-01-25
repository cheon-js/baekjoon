package data_structure;

import java.util.*;

public class parenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		for(int i =0; i<n; i++) {
			System.out.println(solve(in.next()));
			
		}
		
		

	}
	public static String solve(String s) {
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c == '(') {
				stack.push(c);
			}
			else if(stack.isEmpty()) {
				return "NO";
			}
			else
				stack.pop();
		}
		if(stack.isEmpty()) {
			return "YES";
		}
		else
			return "NO";
	}

}
