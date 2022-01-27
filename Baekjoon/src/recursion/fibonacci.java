package recursion;

import java.util.*;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		
		int ans = fibo(n);
		
		System.out.println(ans);
	}

	public static int fibo(int N) {
		if(N >= 2) {
			return fibo(N-1) + fibo(N-2);
		}
		else if(N == 0)
			return 0;
		else
			return 1;
		
	}
}
