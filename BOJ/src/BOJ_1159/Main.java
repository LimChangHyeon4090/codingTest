package BOJ_1159;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int N;
	static int[] count = new int[26];
	static StringBuilder answer = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			count[br.readLine().charAt(0) - 97]++;
		}
		
		for (int i = 0; i < 26; i++) {
			if (count[i] >= 5) answer.append((char)(i+97));
		}
		
		if (answer.length() > 0) System.out.println(answer.toString());
		else System.out.println("PREDAJA");
	}

}
