package brute_force;

import java.util.*;

public class blackjack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int M = in.nextInt();
		
		int[] card = new int[N];
		int sum = 0;
		int temp = 0;
		
		for(int i = 0; i< N; i++) {
			card[i] = in.nextInt();
		}
		
		for(int i =0; i< N; i++) {
			for(int j = i+1; j<N; j++) {
				for(int z = j+1; z<N; z++) {
					sum = card[i] + card[j] + card[z];
					
					if(temp < sum && sum <= M) {
						temp = sum;
					}
				}
			}
		}
		
		
		System.out.println(temp);
	}


}
