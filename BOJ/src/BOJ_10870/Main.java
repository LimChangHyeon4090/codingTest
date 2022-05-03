package BOJ_10870;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int N;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		System.out.println(fibo(N));
	}
	
	public static int fibo(int N) {
		if (N == 0) return 0;
		if (N == 1) return 1;
		else return fibo(N-1) + fibo(N-2);
	}
}
