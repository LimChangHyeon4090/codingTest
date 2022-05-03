package 입출력과_사칙연산.BOJ_2588;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int A;
	static char[] B;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		A = Integer.parseInt(br.readLine());
		B = br.readLine().toCharArray();
		
		System.out.println(A * (B[2] - '0'));
		System.out.println(A * (B[1] - '0'));
		System.out.println(A * (B[0] - '0'));
		System.out.println(A * (B[2] - '0') + A * (B[1] - '0') * 10 + A * (B[0] - '0') * 100);
	}

}
