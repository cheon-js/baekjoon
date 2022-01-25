package data_structure;

import java.util.*;

public class print_queue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		StringBuilder sb = new StringBuilder();
		
		int n = in.nextInt();
		
		for(int i = 0; i<n; i++) {
			int N = in.nextInt(); // 총 문서 개수
			int M = in.nextInt(); // 원하는 문서 위치 값
			
			LinkedList<int[]> que = new LinkedList<>();
			int count = 0;
			
			for(int j = 0; j<N; j++) {
				que.offer(new int[] {j, in.nextInt()} );
			}
			
			while(!que.isEmpty()) {
				int[] first = que.poll();
				boolean isMax = true;
				
				for(int z = 0; z<que.size(); z++) {
					if(first[1] < que.get(z)[1]) {
						que.offer(first);
						for(int j = 0; j<z; j++) {
							que.offer(que.poll());
						}
						isMax = false;
						break;
					}
					
				}
				if(isMax == false) {
					continue;
				}
				
				count++;
				if(first[0] == M)
					break;
			}
			
			sb.append(count).append("\n");
			
		}
		System.out.print(sb);
		
	}

}
