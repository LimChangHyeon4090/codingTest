package BOJ_1110;

import java.util.Scanner;

public class Main {

	static int N;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		
		int fix = N;
		int M = -1;
		int count = 0;
		
		while(true) {
			if (M == fix) break;
			count++;
			M = N % 10 + N / 10;
			M = (N % 10) * 10 + (M % 10);
			N = M;
		}
		
		System.out.println(count);
	}

}
