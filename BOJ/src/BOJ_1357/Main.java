package BOJ_1357;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int X, Y;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		X = Integer.parseInt(st.nextToken());
		Y = Integer.parseInt(st.nextToken());
		
		System.out.println( REV( REV(X) + REV(Y) ) );
	}
	
	public static int REV(int n) {
		String value = Integer.toString(n);
		char[] origin = value.toCharArray();
		
		char[] rev = new char[value.length()];
		for (int i = 0; i < rev.length; i++) {
			rev[i] = origin[origin.length - 1 - i];
		}
		
		String reverse = new String(rev);
		
		return Integer.parseInt(reverse);
	}
	
}
