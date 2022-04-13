package BOJ_1157;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static String s;
	static int[] count = new int[26];
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		s = br.readLine().toLowerCase();
		
		for (int i = 0; i < s.length(); i++) {
//			System.out.println(s.charAt(i) - 97);
			count[s.charAt(i) - 97]++;
		}
		
		// 가장 횟수가 많은 단어를 찾는다
		// 만약, 가장 횟수가 많은 단어가 여러 개라면, ?를 출력한다
		int max = 0;
		boolean dup = false;
		for (int i = 1; i < 26; i++) {
			if (count[max] < count[i]) {
				max = i;
				dup = false;
			}
			else if (count[max] == count[i] ) dup = true;
		}
		
		if (dup) System.out.println("?");
		else System.out.println((char)(max + 65));
	}

}
