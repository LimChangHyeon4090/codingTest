package BOJ_1075;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int N, F;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		F = Integer.parseInt(br.readLine());
		
		int M = (N / 100) * 100;
		
		while(true) {
			if (M % F == 0) break;
			M++;
		}
		
		System.out.printf("%02d", M % 100);
	}

}
