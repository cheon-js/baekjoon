package sort;

import java.util.*;

public class number_sort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		
		int N = in.nextInt();
		
		int[] nums = new int[N];
		
		for(int i = 0; i<N; i++) {
			nums[i] = in.nextInt();
		}
		Arrays.sort(nums);
		for(int i=0; i<N; i++) {
			sb.append(nums[i]).append("\n");
		}
		System.out.println(sb);
	}

}
