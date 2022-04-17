package BOJ_1236;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int N, M, row, col, answer;
	static char[][] map;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new char[N][M];
		
		for (int i = 0; i < N; i++) {
			String s = br.readLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = s.charAt(j);
			}
		}
		
		// 각 row를 확인해서 X의 유무 판단
		for (int i = 0; i < N; i++) {
			boolean check = false;
			for (int j = 0; j < M; j++) {
				if (map[i][j] == 'X') {
					check = true;
					break;
				}
			}
			if (!check) row++;
		}
		
		// 각 col를 확인해서 X의 유무 판단
		for (int j = 0; j < M; j++) {
			boolean check = false;
			for (int i = 0; i < N; i++) {
				if (map[i][j] == 'X') {
					check = true;
					break;
				}
			}
			if (!check) col++;
		}
		
		System.out.println(Math.max(row, col));
	}

}
