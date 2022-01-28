package brute_force;

import java.util.*;

public class digit_generator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int answer = 0;
		
		for(int i = 0; i<N; i++) {
			int number = i;
			int sum = 0;
			
			while(number != 0) {
				sum += number %10;
				number = number/10;
			}
			if((sum + i) == N) {
				answer = i;
				break;
			}
		}
		System.out.println(answer);
	}

}
