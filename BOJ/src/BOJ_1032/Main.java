package BOJ_1032;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int T;
	static String[] s;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		T = Integer.parseInt(br.readLine());
		s = new String[T];
		
		for (int t = 0; t < T; t++) {
			s[t] = br.readLine();
		}
		
		for (int i = 0; i < s[0].length(); i++) {
			boolean check = true;
			for (int t = 1; t < T; t++) {
				if (s[0].charAt(i) != s[t].charAt(i)) {
					check = false;
					break;
				}
			}
			if (check) sb.append(s[0].charAt(i));
			else sb.append('?');
		}
		
		System.out.println(sb.toString());
	}

}
