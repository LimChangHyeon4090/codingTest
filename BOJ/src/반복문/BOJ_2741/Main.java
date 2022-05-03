package 반복문.BOJ_2741;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int N;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		int count = 1;
		
		while (N >= count) {
			System.out.println(count++);
		}
	}

}
