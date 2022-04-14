package BOJ_9012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {

	static Stack<Character> stack = new Stack<>();
	static String s;
	static int T;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br =  new BufferedReader(new InputStreamReader(System.in));
		
		T = Integer.parseInt(br.readLine());
		boolean success = true;
		
		for (int t = 1; t <= T; t++) {
			
			s = br.readLine();
			success = true;
			stack.clear();
			
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '(') stack.push('(');
				else {
					if (stack.isEmpty()) success = false;
					else stack.pop();
				}
			}
			
			if (!stack.isEmpty()) success = false;
			
			if (success) System.out.println("YES");
			else System.out.println("NO");
		}
		
	}

}
