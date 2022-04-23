package BOJ_1268;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int N;
	static int[][] room;
	static int[] with;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		
		room = new int[N + 1][5];
		with = new int[N + 1];
		
		for (int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 5; j++) {
				room[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		// 각 학생에 대해서 같은 반을 한적이 있는지 체크
		for (int i = 1; i <= N; i++) {
			
			for (int y = 1; y <= N; y++) {
				// 자신이 아닌 다른 학생에 대해서 체크를 해야할 것
				if(y == i) continue;
				// 같은 반을 한 적이 있는지 없는지 체크
				boolean check = false;
				// y 학생에 대해서 5개의 반을 모두 체크한다
				for (int x = 0; x < 5; x++) {
					if (room[y][x] == room[i][x]) { 
						check = true;
						break;
					}
				}
				// 같은 반을 한 적이 있다면, i 학생의 카운트를 하나 더한다
				if (check) with[i]++;
			}
			
		}
		
		// with 배열을 통해서 값이 가장 큰 값을 찾는다
		int max_idx = 1;
		for (int i = 2; i <= N; i++) {
			if (with[max_idx] < with[i]) max_idx = i;
		}
		
		System.out.println(max_idx);
	}

}
