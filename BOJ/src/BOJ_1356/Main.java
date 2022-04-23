package BOJ_1356;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static char[] N;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = br.readLine().toCharArray();
		
		boolean check = false;
		
		for (int i = 0; i < N.length - 1; i++) {
			int front = 1;
			int back = 1;
			
			for (int f = 0; f <= i; f++) {
				front *= ( N[f] - '0' );
			}
			for (int b = i + 1; b < N.length; b++) {
				back *= ( N[b] - '0' );
			}
			
			if (front == back) check = true;
			if (check) break;
		}
		
		if (check) System.out.println("YES");
		else System.out.println("NO");
	}

}
