package data_structure;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class stack_zero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int k = in.nextInt();
        int sum = 0;
        
        for(int i = 0; i<k; i++){
            int input = in.nextInt();
            
            if(input != 0){
            	stack.push(input);
            }
            else if(input == 0) {
            	stack.pop();

            }
         
            
        }
        Iterator<Integer> iter = stack.iterator();
        while(iter.hasNext()) {
        	sum += iter.next();
        }
        System.out.println(sum);
	}

}
