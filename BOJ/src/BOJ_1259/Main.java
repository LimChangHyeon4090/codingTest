package BOJ_1259;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			String s = br.readLine();
			if (s.equals("0")) break;
			
			boolean check = true;
			for (int i = 0; i < s.length()/2; i++) {
				if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
					check = false;
					break;
				}
			}
			
			if (check) System.out.println("yes");
			else System.out.println("no");
		}
	}

}
