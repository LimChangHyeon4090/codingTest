package BOJ_1371;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int[] count = new int[26];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		
		while ( (s = br.readLine()) != null ) {
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == ' ') continue;
				count[s.charAt(i) - 'a']++;
			}
		}
		
		int max = 0;
		
		for (int i = 0; i < 26; i++) {
			if (max < count[i]) max = count[i];
		}
		
		for (int i = 0; i < 26; i++) {
			if (count[i] == max) System.out.print((char)(i + 'a'));
		}
		
	}

}
