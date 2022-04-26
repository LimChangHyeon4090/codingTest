package BOJ_1316;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	static int N, answer;
	static int[] check;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		answer = 0;
		
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			check = new int[26];
			
			char prev = '0';
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(j) != prev) {
					prev = s.charAt(j);
					check[s.charAt(j) - 'a']++;
				}
			}
			
			boolean isGroup = true;
			for (int j = 0; j < 26; j++) {
				if (check[j] != 0 && check[j] != 1) {
					isGroup = false;
					break;
				}
			}
			
			if (isGroup) answer++;
		}
		
		// 출력
		System.out.println(answer);
	}

}
