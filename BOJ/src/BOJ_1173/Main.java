package BOJ_1173;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int N, m, M, T, R;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		T = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		
		int count = 0;
		int time = 0;
		
		// 초기 맥박
		int X = m;
		
		if ( M - m < T ) time = -1;
		else {
			while (count != N) {
				if (X + T > M) {
					if (X-R < m) X = m;
					else X = X-R;
				}
				else {
					X = X+T;
					count++;
				}
				
				time++;
			}
		}
		
		System.out.println(time);
	}

}
