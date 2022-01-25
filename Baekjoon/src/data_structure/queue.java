package data_structure;

import java.util.*;
import java.io.*;


public class queue {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Queue<Integer> que = new LinkedList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int input = 0;
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			String str = st.nextToken();
			
			switch(str) {
			
			case "push":
				input = Integer.parseInt(st.nextToken());
				que.offer(input);
				break;
			case "pop":
				sb.append(que.isEmpty() ?  -1 : que.poll()).append("\n");
				break;
			case "size":
				sb.append(que.size()).append("\n");
				break;
			case "empty":
				sb.append(que.isEmpty() ?  1 : 0).append("\n");
				break;
			case "front":
				sb.append(que.isEmpty() ?  -1 : que.peek()).append("\n");
				break;
			case "back":
				sb.append(que.isEmpty() ?  -1 : input).append("\n");
				break;
			}
			
		}
		System.out.print(sb);
	}

}
