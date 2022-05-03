package BOJ_10872;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int N;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		System.out.println(fact(N));
	}
	
	public static int fact(int N) {
		if (N == 1 || N == 0) return 1;
		else return fact(N-1) * N;
	}

}
