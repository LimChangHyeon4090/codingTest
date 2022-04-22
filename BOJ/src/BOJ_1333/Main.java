package BOJ_1333;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int N, L, D, answer;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());
		D = Integer.parseInt(st.nextToken());
		answer = D;
		
		while (true) {
			if ( answer / (L+5) >= N ) break;
			else if ( answer % (L+5) >= L ) break;
			else answer += D;
		}
		
		System.out.println(answer);
	}

}
