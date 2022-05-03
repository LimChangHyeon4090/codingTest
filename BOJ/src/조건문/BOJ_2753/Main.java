package 조건문.BOJ_2753;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int N;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		if (N % 4 == 0 && N % 100 != 0) System.out.println(1);
		else if (N % 400 == 0) System.out.println(1);
		else System.out.println(0);
		
	}

}
