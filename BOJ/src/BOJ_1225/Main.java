package BOJ_1225;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static char[] n, m;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = st.nextToken().toCharArray();
		m = st.nextToken().toCharArray();
		
		Long answer = 0L;
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < m.length; j++) {
				answer = answer + ( (n[i] - '0') * (m[j] - '0'));
			}
		}
		
		System.out.println(answer);
	}

}
