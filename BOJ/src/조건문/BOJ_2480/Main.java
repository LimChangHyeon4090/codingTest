package 조건문.BOJ_2480;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int A, B, C;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		A = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		if (A == B && B == C) System.out.println(10000 + 1000*A);
		else if (A == B) System.out.println(1000 + 100*A);
		else if (B == C) System.out.println(1000 + 100*B);
		else if (C == A) System.out.println(1000 + 100*C);
		else System.out.println(100*Math.max(Math.max(A, B), C));
	}

}
