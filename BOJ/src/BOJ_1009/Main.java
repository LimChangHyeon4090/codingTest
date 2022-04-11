package BOJ_1009;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int T, a, b, answer;
	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		
		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			a = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			
			answer = 1;
			
			// a**b mod 10 을 계산하는 문제
			for (int i = 0; i < b; i++) {
				answer = answer * a;
				if ( answer >= 10 ) answer = answer % 10;
			}
			
			// 결과가 0이면, 10을 반환해야한다
			if ( answer == 0 ) answer = 10;
			
			// 출력
			System.out.println(answer);
		}
		
	}

}
