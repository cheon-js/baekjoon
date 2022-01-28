package sort;

import java.util.*;

public class number_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		
		int[] nums = new int[N];
		
		for(int i = 0; i<N; i++) {
			nums[i] = in.nextInt();
		}
		Arrays.sort(nums);
		for(int i=0; i<N; i++) {
			System.out.println(nums[i]);
		}
		
	}

}
