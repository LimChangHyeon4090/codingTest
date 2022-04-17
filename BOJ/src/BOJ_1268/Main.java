package BOJ_1268;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int N;
	static int[][] room;
	static boolean[][] with;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		room = new int[N][5];
		with = new boolean[N][5];
		
		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				room[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// 각 학생에 대해서 같은 반을 한적이 있는지 체크
		
		
		
	}

}
