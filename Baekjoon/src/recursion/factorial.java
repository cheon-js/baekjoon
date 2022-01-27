package recursion;

import java.util.*;

public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		int fac = factor(N);
		
		System.out.println(fac);
	}
	
	public static int factor(int n) {
		if(n < 1) return 1;
		
		return n * factor(n-1);
		
	}
		
	

}
