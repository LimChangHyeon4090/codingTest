package BOJ_1145;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	static int[] list = new int[5];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < 5; i++) {
			list[i] = Integer.parseInt(st.nextToken());
		}
		
		int check = 1;
		
		while(true) {
			int count = 0;
			
			for (int i = 0; i < 5; i++) {
				if (check % list[i] == 0) count++;
			}
			
			if (count >= 3) break;
			else check++;
		}
		
		System.out.println(check);
	}

}
