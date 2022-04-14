package BOJ_1100;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static char[][] map = new char[8][8];
	static int answer = 0;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i = 0; i < 8; i++) {
			map[i] = br.readLine().toCharArray();
		}
		
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				if ( (i+j) % 2 == 0 && map[i][j] == 'F') answer++;
			}
		}
		
		System.out.println(answer);
	}

}
